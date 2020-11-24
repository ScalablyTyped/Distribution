package typings.josa

import typings.josa.mod.Conjunction
import typings.josa.mod.Josa_
import typings.josa.mod.Means
import typings.josa.mod.Objective
import typings.josa.mod.Subject
import typings.josa.mod.Topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object josaStrings {
  
  @scala.inline
  def 가: 가 = "\uAC00".asInstanceOf[가]
  
  @scala.inline
  def 과: 과 = "\uACFC".asInstanceOf[과]
  
  @scala.inline
  def 는: 는 = "\uB294".asInstanceOf[는]
  
  @scala.inline
  def 로: 로 = "\uB85C".asInstanceOf[로]
  
  @scala.inline
  def 를: 를 = "\uB97C".asInstanceOf[를]
  
  @scala.inline
  def 와: 와 = "\uC640".asInstanceOf[와]
  
  @scala.inline
  def 으로: 으로 = "\uC73C\uB85C".asInstanceOf[으로]
  
  @scala.inline
  def 은: 은 = "\uC740".asInstanceOf[은]
  
  @scala.inline
  def 을: 을 = "\uC744".asInstanceOf[을]
  
  @scala.inline
  def 이: 이 = "\uC774".asInstanceOf[이]
  
  @js.native
  sealed trait 가
    extends Josa_
       with Subject
  
  @js.native
  sealed trait 과
    extends Conjunction
       with Josa_
  
  @js.native
  sealed trait 는
    extends Josa_
       with Topic
  
  @js.native
  sealed trait 로
    extends Josa_
       with Means
  
  @js.native
  sealed trait 를
    extends Josa_
       with Objective
  
  @js.native
  sealed trait 와
    extends Conjunction
       with Josa_
  
  @js.native
  sealed trait 으로
    extends Josa_
       with Means
  
  @js.native
  sealed trait 은
    extends Josa_
       with Topic
  
  @js.native
  sealed trait 을
    extends Josa_
       with Objective
  
  @js.native
  sealed trait 이
    extends Josa_
       with Subject
}
