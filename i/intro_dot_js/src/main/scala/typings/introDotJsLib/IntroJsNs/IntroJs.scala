package typings
package introDotJsLib.IntroJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntroJs extends js.Object {
  def addHints(): IntroJs = js.native
  def exit(): IntroJs = js.native
  def goToStep(step: scala.Double): IntroJs = js.native
  def goToStepNumber(stepId: scala.Double): IntroJs = js.native
  def hideHint(stepId: scala.Double): IntroJs = js.native
  def hideHints(): IntroJs = js.native
  def nextStep(): IntroJs = js.native
  def onafterchange(callback: js.Function1[/* element */ stdLib.HTMLElement, _]): IntroJs = js.native
  def onbeforechange(callback: js.Function1[/* element */ stdLib.HTMLElement, _]): IntroJs = js.native
  def onchange(callback: js.Function1[/* element */ stdLib.HTMLElement, _]): IntroJs = js.native
  def oncomplete(callback: js.Function): IntroJs = js.native
  def onexit(callback: js.Function): IntroJs = js.native
  def onhintclick(
    callback: js.Function3[/* hintElement */ stdLib.HTMLElement, /* item */ Step, /* stepId */ scala.Double, _]
  ): IntroJs = js.native
  def onhintclose(callback: js.Function1[/* stepId */ scala.Double, _]): IntroJs = js.native
  def onhintsadded(callback: js.Function): IntroJs = js.native
  def previousStep(): IntroJs = js.native
  def refresh(): IntroJs = js.native
  def removeHint(stepId: scala.Double): IntroJs = js.native
  def removeHints(): IntroJs = js.native
  def setOption(option: java.lang.String, value: java.lang.String): IntroJs = js.native
  def setOption(option: java.lang.String, value: scala.Boolean): IntroJs = js.native
  def setOption(option: java.lang.String, value: scala.Double): IntroJs = js.native
  def setOptions(options: Options): IntroJs = js.native
  def showHint(stepId: scala.Double): IntroJs = js.native
  def showHints(): IntroJs = js.native
  def start(): IntroJs = js.native
}

