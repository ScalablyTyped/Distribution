package typings
package josaLib.josaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("josa", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getJosaPicker(
    josa: josaLib.josaMod.Conjunction | josaLib.josaMod.Means | josaLib.josaMod.Objective | josaLib.josaMod.Subject | josaLib.josaMod.Topic
  ): js.Function1[/* noun */ java.lang.String, josaLib.josaMod.Topic] = js.native
  def josa(sentence: java.lang.String): java.lang.String = js.native
  def makeJosaify(josa: josaLib.josaMod.Josa): js.Function1[/* noun */ java.lang.String, java.lang.String] = js.native
}

