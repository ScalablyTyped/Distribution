package typings.josa

import typings.josa.josaMod.Conjunction
import typings.josa.josaMod.Josa
import typings.josa.josaMod.Means
import typings.josa.josaMod.Objective
import typings.josa.josaMod.Subject
import typings.josa.josaMod.Topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("josa", JSImport.Namespace)
@js.native
object josaMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaStrings.BACKSLASHuC640
    - typings.josa.josaStrings.BACKSLASHuACFC
  */
  trait Conjunction extends Josa
  
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaMod.Topic
    - typings.josa.josaMod.Subject
    - typings.josa.josaMod.Objective
    - typings.josa.josaMod.Conjunction
    - typings.josa.josaMod.Means
  */
  trait Josa extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaStrings.BACKSLASHuC73CBACKSLASHuB85C
    - typings.josa.josaStrings.BACKSLASHuB85C
  */
  trait Means extends Josa
  
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaStrings.BACKSLASHuC744
    - typings.josa.josaStrings.BACKSLASHuB97C
  */
  trait Objective extends Josa
  
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaStrings.BACKSLASHuC774
    - typings.josa.josaStrings.BACKSLASHuAC00
  */
  trait Subject extends Josa
  
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaStrings.BACKSLASHuC740
    - typings.josa.josaStrings.BACKSLASHuB294
  */
  trait Topic extends Josa
  
  def getJosaPicker(josa: Conjunction): js.Function1[/* noun */ String, Conjunction] = js.native
  def getJosaPicker(josa: Means): js.Function1[/* noun */ String, Means] = js.native
  def getJosaPicker(josa: Objective): js.Function1[/* noun */ String, Objective] = js.native
  def getJosaPicker(josa: Subject): js.Function1[/* noun */ String, Subject] = js.native
  def getJosaPicker(josa: Topic): js.Function1[/* noun */ String, Topic] = js.native
  def josa(sentence: String): String = js.native
  def makeJosaify(josa: Josa): js.Function1[/* noun */ String, String] = js.native
}

