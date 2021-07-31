package typings.josa

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("josa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getJosaPicker(josa: Conjunction): js.Function1[/* noun */ String, Conjunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJosaPicker")(josa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* noun */ String, Conjunction]]
  @scala.inline
  def getJosaPicker(josa: Means): js.Function1[/* noun */ String, Means] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJosaPicker")(josa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* noun */ String, Means]]
  @scala.inline
  def getJosaPicker(josa: Objective): js.Function1[/* noun */ String, Objective] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJosaPicker")(josa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* noun */ String, Objective]]
  @scala.inline
  def getJosaPicker(josa: Subject): js.Function1[/* noun */ String, Subject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJosaPicker")(josa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* noun */ String, Subject]]
  @scala.inline
  def getJosaPicker(josa: Topic): js.Function1[/* noun */ String, Topic] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJosaPicker")(josa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* noun */ String, Topic]]
  
  @scala.inline
  def josa(sentence: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("josa")(sentence.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def makeJosaify(josa: Josa_): js.Function1[/* noun */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeJosaify")(josa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* noun */ String, String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaStrings.와
    - typings.josa.josaStrings.과
  */
  trait Conjunction extends StObject
  object Conjunction {
    
    @scala.inline
    def 과: typings.josa.josaStrings.과 = "\uACFC".asInstanceOf[typings.josa.josaStrings.과]
    
    @scala.inline
    def 와: typings.josa.josaStrings.와 = "\uC640".asInstanceOf[typings.josa.josaStrings.와]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaStrings.은
    - typings.josa.josaStrings.는
    - typings.josa.josaStrings.이
    - typings.josa.josaStrings.가
    - typings.josa.josaStrings.을
    - typings.josa.josaStrings.를
    - typings.josa.josaStrings.와
    - typings.josa.josaStrings.과
    - typings.josa.josaStrings.으로
    - typings.josa.josaStrings.로
  */
  trait Josa_ extends StObject
  object Josa_ {
    
    @scala.inline
    def 가: typings.josa.josaStrings.가 = "\uAC00".asInstanceOf[typings.josa.josaStrings.가]
    
    @scala.inline
    def 과: typings.josa.josaStrings.과 = "\uACFC".asInstanceOf[typings.josa.josaStrings.과]
    
    @scala.inline
    def 는: typings.josa.josaStrings.는 = "\uB294".asInstanceOf[typings.josa.josaStrings.는]
    
    @scala.inline
    def 로: typings.josa.josaStrings.로 = "\uB85C".asInstanceOf[typings.josa.josaStrings.로]
    
    @scala.inline
    def 를: typings.josa.josaStrings.를 = "\uB97C".asInstanceOf[typings.josa.josaStrings.를]
    
    @scala.inline
    def 와: typings.josa.josaStrings.와 = "\uC640".asInstanceOf[typings.josa.josaStrings.와]
    
    @scala.inline
    def 으로: typings.josa.josaStrings.으로 = "\uC73C\uB85C".asInstanceOf[typings.josa.josaStrings.으로]
    
    @scala.inline
    def 은: typings.josa.josaStrings.은 = "\uC740".asInstanceOf[typings.josa.josaStrings.은]
    
    @scala.inline
    def 을: typings.josa.josaStrings.을 = "\uC744".asInstanceOf[typings.josa.josaStrings.을]
    
    @scala.inline
    def 이: typings.josa.josaStrings.이 = "\uC774".asInstanceOf[typings.josa.josaStrings.이]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaStrings.으로
    - typings.josa.josaStrings.로
  */
  trait Means extends StObject
  object Means {
    
    @scala.inline
    def 로: typings.josa.josaStrings.로 = "\uB85C".asInstanceOf[typings.josa.josaStrings.로]
    
    @scala.inline
    def 으로: typings.josa.josaStrings.으로 = "\uC73C\uB85C".asInstanceOf[typings.josa.josaStrings.으로]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaStrings.을
    - typings.josa.josaStrings.를
  */
  trait Objective extends StObject
  object Objective {
    
    @scala.inline
    def 를: typings.josa.josaStrings.를 = "\uB97C".asInstanceOf[typings.josa.josaStrings.를]
    
    @scala.inline
    def 을: typings.josa.josaStrings.을 = "\uC744".asInstanceOf[typings.josa.josaStrings.을]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaStrings.이
    - typings.josa.josaStrings.가
  */
  trait Subject extends StObject
  object Subject {
    
    @scala.inline
    def 가: typings.josa.josaStrings.가 = "\uAC00".asInstanceOf[typings.josa.josaStrings.가]
    
    @scala.inline
    def 이: typings.josa.josaStrings.이 = "\uC774".asInstanceOf[typings.josa.josaStrings.이]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.josa.josaStrings.은
    - typings.josa.josaStrings.는
  */
  trait Topic extends StObject
  object Topic {
    
    @scala.inline
    def 는: typings.josa.josaStrings.는 = "\uB294".asInstanceOf[typings.josa.josaStrings.는]
    
    @scala.inline
    def 은: typings.josa.josaStrings.은 = "\uC740".asInstanceOf[typings.josa.josaStrings.은]
  }
}
