package typings
package jakeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnvVars extends js.Object {
  var envVars: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var opts: Anon_NameQuiet
  var taskArgs: js.Array[java.lang.String]
  var taskNames: js.Array[java.lang.String]
}

object Anon_EnvVars {
  @scala.inline
  def apply(
    envVars: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    opts: Anon_NameQuiet,
    taskArgs: js.Array[java.lang.String],
    taskNames: js.Array[java.lang.String]
  ): Anon_EnvVars = {
    val __obj = js.Dynamic.literal(envVars = envVars, opts = opts, taskArgs = taskArgs, taskNames = taskNames)
  
    __obj.asInstanceOf[Anon_EnvVars]
  }
}

