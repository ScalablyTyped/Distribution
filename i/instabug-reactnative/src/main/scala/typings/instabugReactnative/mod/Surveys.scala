package typings.instabugReactnative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instabug-reactnative", "Surveys")
@js.native
object Surveys extends js.Object {
  
  def getAvailableSurveys(availableSurveysCallback: js.Function1[/* surveys */ js.Array[Survey], Unit]): Unit = js.native
  
  def hasRespondedToSurvey(surveyToken: String, surveyTokenCallback: js.Function1[/* hasResponded */ Boolean, Unit]): Unit = js.native
  
  def onDismissCallback(didDismissSurveyHandler: js.Function0[Unit]): Unit = js.native
  
  def onShowCallback(willShowSurveyHandler: js.Function0[Unit]): Unit = js.native
  
  def setAppStoreURL(appStoreURL: String): Unit = js.native
  
  def setAutoShowingEnabled(autoShowingSurveysEnabled: Boolean): Unit = js.native
  
  def setEnabled(isEnabled: Boolean): Unit = js.native
  
  def setOnDismissHandler(onDismissHandler: js.Function0[Unit]): Unit = js.native
  
  def setOnShowHandler(onShowHandler: js.Function0[Unit]): Unit = js.native
  
  def setShouldShowWelcomeScreen(shouldShowWelcomeScreen: Boolean): Unit = js.native
  
  def setThresholdForReshowingSurveyAfterDismiss(sessionCount: Double, daysCount: Double): Unit = js.native
  
  def showSurvey(surveyToken: String): Unit = js.native
  
  def showSurveyIfAvailable(): Unit = js.native
}
