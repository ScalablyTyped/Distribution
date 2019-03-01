package typings
package josaLib.josaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("josa", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getJosaPicker(josa: josaLib.josaMod.Conjunction): js.Function1[/* noun */ java.lang.String, josaLib.josaMod.Conjunction] = js.native
  def getJosaPicker(josa: josaLib.josaMod.Means): js.Function1[/* noun */ java.lang.String, josaLib.josaMod.Means] = js.native
  def getJosaPicker(josa: josaLib.josaMod.Objective): js.Function1[/* noun */ java.lang.String, josaLib.josaMod.Objective] = js.native
  def getJosaPicker(josa: josaLib.josaMod.Subject): js.Function1[/* noun */ java.lang.String, josaLib.josaMod.Subject] = js.native
  def getJosaPicker(josa: josaLib.josaMod.Topic): js.Function1[/* noun */ java.lang.String, josaLib.josaMod.Topic] = js.native
  def josa(sentence: java.lang.String): java.lang.String = js.native
  def makeJosaify(josa: josaLib.josaMod.Josa): js.Function1[/* noun */ java.lang.String, java.lang.String] = js.native
}

