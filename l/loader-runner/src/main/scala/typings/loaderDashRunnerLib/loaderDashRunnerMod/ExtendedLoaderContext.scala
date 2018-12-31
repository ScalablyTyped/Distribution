package typings
package loaderDashRunnerLib.loaderDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedLoaderContext extends js.Object {
  var async: js.Function0[js.UndefOr[js.Function0[scala.Unit]]] | scala.Null
  var callback: js.Function0[scala.Unit] | scala.Null
  var context: java.lang.String | scala.Null
  var currentRequest: java.lang.String
  var data: js.Any
  var loaderIndex: scala.Double
  var loaders: js.Array[Loader]
  var previousRequest: java.lang.String
  var query: org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String
  var remainingRequest: java.lang.String
  var request: java.lang.String
  var resource: java.lang.String
  var resourcePath: js.UndefOr[java.lang.String]
  var resourceQuery: js.UndefOr[java.lang.String]
  def addContextDependency(context: java.lang.String): scala.Unit
  def addDependency(file: java.lang.String): scala.Unit
  def cacheable(flag: scala.Boolean): scala.Unit
  def clearDependencies(): scala.Unit
  def dependency(file: java.lang.String): scala.Unit
  def getContextDependencies(): js.Array[java.lang.String]
  def getDependencies(): js.Array[java.lang.String]
}

