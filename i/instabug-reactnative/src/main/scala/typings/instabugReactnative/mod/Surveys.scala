package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Surveys {
  
  @JSImport("instabug-reactnative", "Surveys.getAvailableSurveys")
  @js.native
  def getAvailableSurveys(availableSurveysCallback: js.Function1[/* surveys */ js.Array[Survey], Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.hasRespondedToSurvey")
  @js.native
  def hasRespondedToSurvey(surveyToken: String, surveyTokenCallback: js.Function1[/* hasResponded */ Boolean, Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.onDismissCallback")
  @js.native
  def onDismissCallback(didDismissSurveyHandler: js.Function0[Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.onShowCallback")
  @js.native
  def onShowCallback(willShowSurveyHandler: js.Function0[Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.setAppStoreURL")
  @js.native
  def setAppStoreURL(appStoreURL: String): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.setAutoShowingEnabled")
  @js.native
  def setAutoShowingEnabled(autoShowingSurveysEnabled: Boolean): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.setEnabled")
  @js.native
  def setEnabled(isEnabled: Boolean): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.setOnDismissHandler")
  @js.native
  def setOnDismissHandler(onDismissHandler: js.Function0[Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.setOnShowHandler")
  @js.native
  def setOnShowHandler(onShowHandler: js.Function0[Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.setShouldShowWelcomeScreen")
  @js.native
  def setShouldShowWelcomeScreen(shouldShowWelcomeScreen: Boolean): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.setThresholdForReshowingSurveyAfterDismiss")
  @js.native
  def setThresholdForReshowingSurveyAfterDismiss(sessionCount: Double, daysCount: Double): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.showSurvey")
  @js.native
  def showSurvey(surveyToken: String): Unit = js.native
  
  @JSImport("instabug-reactnative", "Surveys.showSurveyIfAvailable")
  @js.native
  def showSurveyIfAvailable(): Unit = js.native
}
