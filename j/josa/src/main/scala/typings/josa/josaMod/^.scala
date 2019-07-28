package typings.josa.josaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("josa", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getJosaPicker(josa: Conjunction): js.Function1[/* noun */ String, Conjunction] = js.native
  def getJosaPicker(josa: Means): js.Function1[/* noun */ String, Means] = js.native
  def getJosaPicker(josa: Objective): js.Function1[/* noun */ String, Objective] = js.native
  def getJosaPicker(josa: Subject): js.Function1[/* noun */ String, Subject] = js.native
  def getJosaPicker(josa: Topic): js.Function1[/* noun */ String, Topic] = js.native
  def josa(sentence: String): String = js.native
  def makeJosaify(josa: Josa): js.Function1[/* noun */ String, String] = js.native
}

