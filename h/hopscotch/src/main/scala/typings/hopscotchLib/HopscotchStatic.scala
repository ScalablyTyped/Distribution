package typings
package hopscotchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HopscotchStatic extends js.Object {
  /**
     * Sets options for running the tour.
     */
  def configure(options: HopscotchConfiguration): scala.Unit = js.native
  /**
     * Ends the current tour. If clearCookie is set to false, the tour state is preserved.
     * Otherwise, if clearCookie is set to true or is not provided, the tour state is cleared.
     */
  def endTour(clearCookie: scala.Boolean): scala.Unit = js.native
  /**
     * Returns the currently running tour.
     */
  def getCurrStepNum(): scala.Double = js.native
  /**
     * Returns the currently running tour.
     */
  def getCurrTour(): TourDefinition = js.native
  /**
     * Checks for tour state saved in sessionStorage/cookies and returns the state if
     * it exists. Use this method to determine whether or not you should resume a tour.
     */
  def getState(): java.lang.String = js.native
  /**
     * Adds a callback for one of the event types. Valid event types are:
     * *start*, *end*, *next*, *prev*, *show*, *close*, *error*
     */
  def listen(eventName: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
     * Goes forward one step in the tour
     */
  def nextStep(): scala.Unit = js.native
  /**
     * Goes back one step in the tour
     */
  def prevStep(): scala.Unit = js.native
  /**
     * Registers a callback helper. See the section about Helpers below.
     */
  def registerHelper(id: java.lang.String, helper: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  /**
     * Remove callbacks for hopscotch events. If tourOnly is set to true, only removes
     * callbacks specified by a tour (callbacks set by hopscotch.configure or hopscotch.listen
     * will remain). If eventName is null or undefined, callbacks for all events will be removed.
     */
  def removeCallbacks(): scala.Unit = js.native
  /**
     * Remove callbacks for hopscotch events. If tourOnly is set to true, only removes
     * callbacks specified by a tour (callbacks set by hopscotch.configure or hopscotch.listen
     * will remain). If eventName is null or undefined, callbacks for all events will be removed.
     */
  def removeCallbacks(eventName: java.lang.String): scala.Unit = js.native
  /**
     * Remove callbacks for hopscotch events. If tourOnly is set to true, only removes
     * callbacks specified by a tour (callbacks set by hopscotch.configure or hopscotch.listen
     * will remain). If eventName is null or undefined, callbacks for all events will be removed.
     */
  def removeCallbacks(eventName: java.lang.String, tourOnly: scala.Boolean): scala.Unit = js.native
  /**
     * Resets i18n strings to original default values.
     */
  def resetDefaultI18N(): scala.Unit = js.native
  /**
     * Resets all config options to original values.
     */
  def resetDefaultOptions(): scala.Unit = js.native
  /**
     * Skips to a given step in the tour
     */
  def showStep(id: scala.Double): scala.Unit = js.native
  /**
     * Actually starts the tour. Optional stepNum argument specifies what step to start at.
     */
  def startTour(tour: TourDefinition): scala.Unit = js.native
  /**
     * Actually starts the tour. Optional stepNum argument specifies what step to start at.
     */
  def startTour(tour: TourDefinition, stepNum: scala.Double): scala.Unit = js.native
  /**
     * Removes a callback for one of the event types.
     */
  def unlisten(eventName: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

