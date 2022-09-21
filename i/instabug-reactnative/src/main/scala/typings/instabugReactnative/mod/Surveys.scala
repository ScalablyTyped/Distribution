package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Surveys {
  
  @JSImport("instabug-reactnative", "Surveys")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns an array containing the available surveys.
    * @param {availableSurveysCallback} availableSurveysCallback callback with
    * argument available surveys
    *
    */
  inline def getAvailableSurveys(availableSurveysCallback: js.Function1[/* surveys */ js.Array[Survey], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableSurveys")(availableSurveysCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns true if the survey with a specific token was answered before.
    * Will return false if the token does not exist or if the survey was not answered before.
    * @param {string} surveyToken - A String with a survey token.
    * @param {function} surveyTokenCallback callback with argument as the desired value of the whether
    * the survey has been responded to or not.
    *
    */
  inline def hasRespondedToSurvey(surveyToken: String, surveyTokenCallback: js.Function1[/* hasResponded */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hasRespondedToSurvey")(surveyToken.asInstanceOf[js.Any], surveyTokenCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * iOS Only
    * @summary Sets url for the published iOS app on AppStore, You can redirect
    * NPS Surveys or AppRating Surveys to AppStore to let users rate your app on AppStore itself.
    * @param {String} appStoreURL A String url for the published iOS app on AppStore
    */
  inline def setAppStoreURL(appStoreURL: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppStoreURL")(appStoreURL.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets whether auto surveys showing are enabled or not.
    * @param autoShowingSurveysEnabled A boolean to indicate whether the
    *                                surveys auto showing are enabled or not.
    *
    */
  inline def setAutoShowingEnabled(autoShowingSurveysEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoShowingEnabled")(autoShowingSurveysEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @summary Sets whether surveys are enabled or not.
    * If you disable surveys on the SDK but still have active surveys on your Instabug dashboard,
    * those surveys are still going to be sent to the device, but are not going to be
    * shown automatically.
    * To manually display any available surveys, call `Instabug.showSurveyIfAvailable()`.
    * Defaults to `true`.
    * @param {boolean} isEnabled A boolean to set whether Instabug Surveys is enabled or disabled.
    */
  inline def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @summary Sets a block of code to be executed right after the survey's UI is dismissed.
    * This block is executed on the UI thread. Could be used for performing any UI
    * changes after the survey's UI is dismissed.
    * @param {function} onDismissHandler - A block of code that gets executed after
    * the survey's UI is dismissed.
    */
  inline def setOnDismissHandler(onDismissHandler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnDismissHandler")(onDismissHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @summary Sets a block of code to be executed just before the survey's UI is presented.
    * This block is executed on the UI thread. Could be used for performing any UI changes before
    * the survey's UI is shown.
    * @param {function} onShowHandler - A block of code that gets executed before
    * presenting the survey's UI.
    */
  inline def setOnShowHandler(onShowHandler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnShowHandler")(onShowHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Setting an option for all the surveys to show a welcome screen before
    * the user starts taking the survey.
    * @param shouldShowWelcomeScreen A boolean for setting whether the
    *                                welcome screen should show.
    *
    */
  inline def setShouldShowWelcomeScreen(shouldShowWelcomeScreen: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShouldShowWelcomeScreen")(shouldShowWelcomeScreen.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Shows survey with a specific token.
    * Does nothing if there are no available surveys with that specific token.
    * Answered and cancelled surveys won't show up again.
    * @param {string} surveyToken - A String with a survey token.
    *
    */
  inline def showSurvey(surveyToken: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showSurvey")(surveyToken.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @summary Shows one of the surveys that were not shown before, that also have conditions
    * that match the current device/user.
    * Does nothing if there are no available surveys or if a survey has already been shown
    * in the current session.
    */
  inline def showSurveyIfAvailable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showSurveyIfAvailable")().asInstanceOf[Unit]
}
