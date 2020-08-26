package typings.introJs.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntroJs extends js.Object {
  def addHints(): IntroJs = js.native
  /**
    * @link https://introjs.com/docs/intro/api/#introjsaddstepoptions
    */
  def addStep(options: Step): IntroJs = js.native
  /**
    * @link https://introjs.com/docs/intro/api/#introjsaddstepssteps
    */
  def addSteps(steps: js.Array[Step]): IntroJs = js.native
  def exit(): IntroJs = js.native
  def goToStep(step: Double): IntroJs = js.native
  def goToStepNumber(stepId: Double): IntroJs = js.native
  def hideHint(stepId: Double): IntroJs = js.native
  def hideHints(): IntroJs = js.native
  def nextStep(): IntroJs = js.native
  def onafterchange(callback: js.Function1[/* element */ HTMLElement, _]): IntroJs = js.native
  def onbeforechange(callback: js.Function1[/* element */ HTMLElement, _]): IntroJs = js.native
  def onchange(callback: js.Function1[/* element */ HTMLElement, _]): IntroJs = js.native
  def oncomplete(callback: js.Function): IntroJs = js.native
  def onexit(callback: js.Function): IntroJs = js.native
  def onhintclick(callback: js.Function3[/* hintElement */ HTMLElement, /* item */ Step, /* stepId */ Double, _]): IntroJs = js.native
  def onhintclose(callback: js.Function1[/* stepId */ Double, _]): IntroJs = js.native
  def onhintsadded(callback: js.Function): IntroJs = js.native
  def previousStep(): IntroJs = js.native
  def refresh(): IntroJs = js.native
  def removeHint(stepId: Double): IntroJs = js.native
  def removeHints(): IntroJs = js.native
  def setOption(option: String, value: String): IntroJs = js.native
  def setOption(option: String, value: Boolean): IntroJs = js.native
  def setOption(option: String, value: Double): IntroJs = js.native
  def setOptions(options: Options): IntroJs = js.native
  def showHint(stepId: Double): IntroJs = js.native
  def showHints(): IntroJs = js.native
  def start(): IntroJs = js.native
}

