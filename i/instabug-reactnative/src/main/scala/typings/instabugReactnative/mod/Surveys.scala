package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Surveys {
  
  @JSImport("instabug-reactnative", "Surveys")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAvailableSurveys(availableSurveysCallback: js.Function1[/* surveys */ js.Array[Survey], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableSurveys")(availableSurveysCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def hasRespondedToSurvey(surveyToken: String, surveyTokenCallback: js.Function1[/* hasResponded */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hasRespondedToSurvey")(surveyToken.asInstanceOf[js.Any], surveyTokenCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def onDismissCallback(didDismissSurveyHandler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDismissCallback")(didDismissSurveyHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def onShowCallback(willShowSurveyHandler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onShowCallback")(willShowSurveyHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setAppStoreURL(appStoreURL: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppStoreURL")(appStoreURL.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setAutoShowingEnabled(autoShowingSurveysEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoShowingEnabled")(autoShowingSurveysEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setOnDismissHandler(onDismissHandler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnDismissHandler")(onDismissHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setOnShowHandler(onShowHandler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnShowHandler")(onShowHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setShouldShowWelcomeScreen(shouldShowWelcomeScreen: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShouldShowWelcomeScreen")(shouldShowWelcomeScreen.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setThresholdForReshowingSurveyAfterDismiss(sessionCount: Double, daysCount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setThresholdForReshowingSurveyAfterDismiss")(sessionCount.asInstanceOf[js.Any], daysCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def showSurvey(surveyToken: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showSurvey")(surveyToken.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def showSurveyIfAvailable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showSurveyIfAvailable")().asInstanceOf[Unit]
}
