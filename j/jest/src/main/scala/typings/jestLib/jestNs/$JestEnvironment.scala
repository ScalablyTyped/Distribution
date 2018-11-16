package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait $JestEnvironment extends js.Object {
  var fakeTimers: FakeTimers
  var global: Global
  var moduleMocker: ModuleMocker
  var testFilePath: java.lang.String
  def dispose(): scala.Unit
  def runScript(script: Script): js.Any
}

