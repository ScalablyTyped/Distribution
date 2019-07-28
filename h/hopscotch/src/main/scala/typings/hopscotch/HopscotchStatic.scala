package typings.hopscotch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HopscotchStatic extends js.Object {
  /**
    * Sets options for running the tour.
    */
  def configure(options: HopscotchConfiguration): Unit = js.native
  /**
    * Ends the current tour. If clearCookie is set to false, the tour state is preserved.
    * Otherwise, if clearCookie is set to true or is not provided, the tour state is cleared.
    */
  def endTour(clearCookie: Boolean): Unit = js.native
  /**
    * Returns the currently running tour.
    */
  def getCurrStepNum(): Double = js.native
  /**
    * Returns the currently running tour.
    */
  def getCurrTour(): TourDefinition = js.native
  /**
    * Checks for tour state saved in sessionStorage/cookies and returns the state if
    * it exists. Use this method to determine whether or not you should resume a tour.
    */
  def getState(): String = js.native
  /**
    * Adds a callback for one of the event types. Valid event types are:
    * *start*, *end*, *next*, *prev*, *show*, *close*, *error*
    */
  def listen(eventName: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Goes forward one step in the tour
    */
  def nextStep(): Unit = js.native
  /**
    * Goes back one step in the tour
    */
  def prevStep(): Unit = js.native
  /**
    * Registers a callback helper. See the section about Helpers below.
    */
  def registerHelper(id: String, helper: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  /**
    * Remove callbacks for hopscotch events. If tourOnly is set to true, only removes
    * callbacks specified by a tour (callbacks set by hopscotch.configure or hopscotch.listen
    * will remain). If eventName is null or undefined, callbacks for all events will be removed.
    */
  def removeCallbacks(): Unit = js.native
  def removeCallbacks(eventName: String): Unit = js.native
  def removeCallbacks(eventName: String, tourOnly: Boolean): Unit = js.native
  /**
    * Resets i18n strings to original default values.
    */
  def resetDefaultI18N(): Unit = js.native
  /**
    * Resets all config options to original values.
    */
  def resetDefaultOptions(): Unit = js.native
  /**
    * Skips to a given step in the tour
    */
  def showStep(id: Double): Unit = js.native
  /**
    * Actually starts the tour. Optional stepNum argument specifies what step to start at.
    */
  def startTour(tour: TourDefinition): Unit = js.native
  def startTour(tour: TourDefinition, stepNum: Double): Unit = js.native
  /**
    * Removes a callback for one of the event types.
    */
  def unlisten(eventName: String, callback: js.Function0[Unit]): Unit = js.native
}

