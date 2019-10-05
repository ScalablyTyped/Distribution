package typings.introDotJs.IntroJs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntroJs extends js.Object {
  def addHints(): typings.introDotJs.IntroJs.IntroJs = js.native
  def exit(): typings.introDotJs.IntroJs.IntroJs = js.native
  def goToStep(step: Double): typings.introDotJs.IntroJs.IntroJs = js.native
  def goToStepNumber(stepId: Double): typings.introDotJs.IntroJs.IntroJs = js.native
  def hideHint(stepId: Double): typings.introDotJs.IntroJs.IntroJs = js.native
  def hideHints(): typings.introDotJs.IntroJs.IntroJs = js.native
  def nextStep(): typings.introDotJs.IntroJs.IntroJs = js.native
  def onafterchange(callback: js.Function1[/* element */ HTMLElement, _]): typings.introDotJs.IntroJs.IntroJs = js.native
  def onbeforechange(callback: js.Function1[/* element */ HTMLElement, _]): typings.introDotJs.IntroJs.IntroJs = js.native
  def onchange(callback: js.Function1[/* element */ HTMLElement, _]): typings.introDotJs.IntroJs.IntroJs = js.native
  def oncomplete(callback: js.Function): typings.introDotJs.IntroJs.IntroJs = js.native
  def onexit(callback: js.Function): typings.introDotJs.IntroJs.IntroJs = js.native
  def onhintclick(callback: js.Function3[/* hintElement */ HTMLElement, /* item */ Step, /* stepId */ Double, _]): typings.introDotJs.IntroJs.IntroJs = js.native
  def onhintclose(callback: js.Function1[/* stepId */ Double, _]): typings.introDotJs.IntroJs.IntroJs = js.native
  def onhintsadded(callback: js.Function): typings.introDotJs.IntroJs.IntroJs = js.native
  def previousStep(): typings.introDotJs.IntroJs.IntroJs = js.native
  def refresh(): typings.introDotJs.IntroJs.IntroJs = js.native
  def removeHint(stepId: Double): typings.introDotJs.IntroJs.IntroJs = js.native
  def removeHints(): typings.introDotJs.IntroJs.IntroJs = js.native
  def setOption(option: String, value: String): typings.introDotJs.IntroJs.IntroJs = js.native
  def setOption(option: String, value: Boolean): typings.introDotJs.IntroJs.IntroJs = js.native
  def setOption(option: String, value: Double): typings.introDotJs.IntroJs.IntroJs = js.native
  def setOptions(options: Options): typings.introDotJs.IntroJs.IntroJs = js.native
  def showHint(stepId: Double): typings.introDotJs.IntroJs.IntroJs = js.native
  def showHints(): typings.introDotJs.IntroJs.IntroJs = js.native
  def start(): typings.introDotJs.IntroJs.IntroJs = js.native
}

