package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BugReporting {
  
  @js.native
  sealed trait extendedBugReportMode extends StObject
  @JSImport("instabug-reactnative", "BugReporting.extendedBugReportMode")
  @js.native
  object extendedBugReportMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.instabugReactnative.mod.BugReporting.extendedBugReportMode with Double] = js.native
    
    @js.native
    sealed trait disabled
      extends typings.instabugReactnative.mod.BugReporting.extendedBugReportMode
    /* 2 */ val disabled: typings.instabugReactnative.mod.BugReporting.extendedBugReportMode.disabled with Double = js.native
    
    @js.native
    sealed trait enabledWithOptionalFields
      extends typings.instabugReactnative.mod.BugReporting.extendedBugReportMode
    /* 1 */ val enabledWithOptionalFields: typings.instabugReactnative.mod.BugReporting.extendedBugReportMode.enabledWithOptionalFields with Double = js.native
    
    @js.native
    sealed trait enabledWithRequiredFields
      extends typings.instabugReactnative.mod.BugReporting.extendedBugReportMode
    /* 0 */ val enabledWithRequiredFields: typings.instabugReactnative.mod.BugReporting.extendedBugReportMode.enabledWithRequiredFields with Double = js.native
  }
  
  @js.native
  sealed trait invocationEvent extends StObject
  @JSImport("instabug-reactnative", "BugReporting.invocationEvent")
  @js.native
  object invocationEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.instabugReactnative.mod.BugReporting.invocationEvent with Double] = js.native
    
    @js.native
    sealed trait floatingButton
      extends typings.instabugReactnative.mod.BugReporting.invocationEvent
    /* 4 */ val floatingButton: typings.instabugReactnative.mod.BugReporting.invocationEvent.floatingButton with Double = js.native
    
    @js.native
    sealed trait none
      extends typings.instabugReactnative.mod.BugReporting.invocationEvent
    /* 0 */ val none: typings.instabugReactnative.mod.BugReporting.invocationEvent.none with Double = js.native
    
    @js.native
    sealed trait screenshot
      extends typings.instabugReactnative.mod.BugReporting.invocationEvent
    /* 2 */ val screenshot: typings.instabugReactnative.mod.BugReporting.invocationEvent.screenshot with Double = js.native
    
    @js.native
    sealed trait shake
      extends typings.instabugReactnative.mod.BugReporting.invocationEvent
    /* 1 */ val shake: typings.instabugReactnative.mod.BugReporting.invocationEvent.shake with Double = js.native
    
    @js.native
    sealed trait twoFingersSwipe
      extends typings.instabugReactnative.mod.BugReporting.invocationEvent
    /* 3 */ val twoFingersSwipe: typings.instabugReactnative.mod.BugReporting.invocationEvent.twoFingersSwipe with Double = js.native
  }
  
  @js.native
  sealed trait invocationOptions extends StObject
  @JSImport("instabug-reactnative", "BugReporting.invocationOptions")
  @js.native
  object invocationOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.instabugReactnative.mod.BugReporting.invocationOptions with Double] = js.native
    
    @js.native
    sealed trait commentFieldRequired
      extends typings.instabugReactnative.mod.BugReporting.invocationOptions
    /* 2 */ val commentFieldRequired: typings.instabugReactnative.mod.BugReporting.invocationOptions.commentFieldRequired with Double = js.native
    
    @js.native
    sealed trait disablePostSendingDialog
      extends typings.instabugReactnative.mod.BugReporting.invocationOptions
    /* 3 */ val disablePostSendingDialog: typings.instabugReactnative.mod.BugReporting.invocationOptions.disablePostSendingDialog with Double = js.native
    
    @js.native
    sealed trait emailFieldHidden
      extends typings.instabugReactnative.mod.BugReporting.invocationOptions
    /* 0 */ val emailFieldHidden: typings.instabugReactnative.mod.BugReporting.invocationOptions.emailFieldHidden with Double = js.native
    
    @js.native
    sealed trait emailFieldOptional
      extends typings.instabugReactnative.mod.BugReporting.invocationOptions
    /* 1 */ val emailFieldOptional: typings.instabugReactnative.mod.BugReporting.invocationOptions.emailFieldOptional with Double = js.native
  }
  
  @JSImport("instabug-reactnative", "BugReporting.onInvokeHandler")
  @js.native
  def onInvokeHandler(handler: js.Function0[Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.onReportSubmitHandler")
  @js.native
  def onReportSubmitHandler(preSendingHandler: js.Function0[Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.onSDKDismissedHandler")
  @js.native
  def onSDKDismissedHandler(handler: js.Function2[/* dismiss */ dismissType, /* report */ reportType, Unit]): Unit = js.native
  
  @js.native
  sealed trait option extends StObject
  @JSImport("instabug-reactnative", "BugReporting.option")
  @js.native
  object option extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[option with Double] = js.native
    
    @js.native
    sealed trait commentFieldRequired extends option
    /* 2 */ val commentFieldRequired: typings.instabugReactnative.mod.BugReporting.option.commentFieldRequired with Double = js.native
    
    @js.native
    sealed trait disablePostSendingDialog extends option
    /* 3 */ val disablePostSendingDialog: typings.instabugReactnative.mod.BugReporting.option.disablePostSendingDialog with Double = js.native
    
    @js.native
    sealed trait emailFieldHidden extends option
    /* 0 */ val emailFieldHidden: typings.instabugReactnative.mod.BugReporting.option.emailFieldHidden with Double = js.native
    
    @js.native
    sealed trait emailFieldOptional extends option
    /* 1 */ val emailFieldOptional: typings.instabugReactnative.mod.BugReporting.option.emailFieldOptional with Double = js.native
  }
  
  @js.native
  sealed trait reportType extends StObject
  @JSImport("instabug-reactnative", "BugReporting.reportType")
  @js.native
  object reportType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[reportType with Double] = js.native
    
    @js.native
    sealed trait bug extends reportType
    /* 0 */ val bug: typings.instabugReactnative.mod.BugReporting.reportType.bug with Double = js.native
    
    @js.native
    sealed trait feedback extends reportType
    /* 1 */ val feedback: typings.instabugReactnative.mod.BugReporting.reportType.feedback with Double = js.native
    
    @js.native
    sealed trait question extends reportType
    /* 2 */ val question: typings.instabugReactnative.mod.BugReporting.reportType.question with Double = js.native
  }
  
  @JSImport("instabug-reactnative", "BugReporting.setAutoScreenRecordingEnabled")
  @js.native
  def setAutoScreenRecordingEnabled(isEnabled: Boolean): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.setDidSelectPromptOptionHandler")
  @js.native
  def setDidSelectPromptOptionHandler(didSelectPromptOptionHandler: js.Function0[Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.setEnabled")
  @js.native
  def setEnabled(isEnabled: Boolean): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.setExtendedBugReportMode")
  @js.native
  def setExtendedBugReportMode(extendedBugReportMode: typings.instabugReactnative.mod.BugReporting.extendedBugReportMode): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.setInvocationEvents")
  @js.native
  def setInvocationEvents(invocationEvents: js.Array[typings.instabugReactnative.mod.BugReporting.invocationEvent]): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.setInvocationOptions")
  @js.native
  def setInvocationOptions(invocationOptions: js.Array[typings.instabugReactnative.mod.BugReporting.invocationOptions]): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.setReportTypes")
  @js.native
  def setReportTypes(types: js.Array[reportType]): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.setShakingThresholdForAndroid")
  @js.native
  def setShakingThresholdForAndroid(androidThreshold: Double): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.setShakingThresholdForiPad")
  @js.native
  def setShakingThresholdForiPad(iPadShakingThreshold: Double): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.setShakingThresholdForiPhone")
  @js.native
  def setShakingThresholdForiPhone(iPhoneShakingThreshold: Double): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.setViewHierarchyEnabled")
  @js.native
  def setViewHierarchyEnabled(isEnabled: Boolean): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.show")
  @js.native
  def show(`type`: reportType, options: js.Array[option]): Unit = js.native
  
  @JSImport("instabug-reactnative", "BugReporting.showWithOptions")
  @js.native
  def showWithOptions(`type`: reportType, options: js.Array[option]): Unit = js.native
}
