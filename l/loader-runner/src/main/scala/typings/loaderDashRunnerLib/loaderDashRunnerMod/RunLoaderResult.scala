package typings
package loaderDashRunnerLib.loaderDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RunLoaderResult extends js.Object {
  var cacheable: scala.Boolean
  var contextDependencies: js.Array[java.lang.String]
  var fileDependencies: js.Array[java.lang.String]
  var resourceBuffer: js.UndefOr[nodeLib.Buffer | scala.Null] = js.undefined
  var result: js.UndefOr[js.Array[nodeLib.Buffer | scala.Null]] = js.undefined
}

