package typings
package josaLib.josaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("josa", JSImport.Namespace)
@js.native
object josaModMembers extends js.Object {
  def getJosaPicker(josa: Conjunction | Means | Objective | Subject | Topic): js.Function1[/* noun */ java.lang.String, Topic] = js.native
  def josa(sentence: java.lang.String): java.lang.String = js.native
  def makeJosaify(josa: Josa): js.Function1[/* noun */ java.lang.String, java.lang.String] = js.native
}

