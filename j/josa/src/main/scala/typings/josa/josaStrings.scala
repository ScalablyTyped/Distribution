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

object josaStrings {
  @js.native
  sealed trait 가
    extends Josa
       with Subject
  
  @js.native
  sealed trait 과
    extends Conjunction
       with Josa
  
  @js.native
  sealed trait 는
    extends Josa
       with Topic
  
  @js.native
  sealed trait 로
    extends Josa
       with Means
  
  @js.native
  sealed trait 를
    extends Josa
       with Objective
  
  @js.native
  sealed trait 와
    extends Conjunction
       with Josa
  
  @js.native
  sealed trait 으로
    extends Josa
       with Means
  
  @js.native
  sealed trait 은
    extends Josa
       with Topic
  
  @js.native
  sealed trait 을
    extends Josa
       with Objective
  
  @js.native
  sealed trait 이
    extends Josa
       with Subject
  
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
}

