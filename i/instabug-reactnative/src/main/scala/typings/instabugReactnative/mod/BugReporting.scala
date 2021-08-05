package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BugReporting {
  
  @JSImport("instabug-reactnative", "BugReporting")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait extendedBugReportMode extends StObject
  @JSImport("instabug-reactnative", "BugReporting.extendedBugReportMode")
  @js.native
  object extendedBugReportMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.instabugReactnative.mod.BugReporting.extendedBugReportMode & Double] = js.native
    
    @js.native
    sealed trait disabled
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.extendedBugReportMode
    /* 2 */ val disabled: typings.instabugReactnative.mod.BugReporting.extendedBugReportMode.disabled & Double = js.native
    
    @js.native
    sealed trait enabledWithOptionalFields
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.extendedBugReportMode
    /* 1 */ val enabledWithOptionalFields: typings.instabugReactnative.mod.BugReporting.extendedBugReportMode.enabledWithOptionalFields & Double = js.native
    
    @js.native
    sealed trait enabledWithRequiredFields
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.extendedBugReportMode
    /* 0 */ val enabledWithRequiredFields: typings.instabugReactnative.mod.BugReporting.extendedBugReportMode.enabledWithRequiredFields & Double = js.native
  }
  
  @js.native
  sealed trait invocationEvent extends StObject
  @JSImport("instabug-reactnative", "BugReporting.invocationEvent")
  @js.native
  object invocationEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.instabugReactnative.mod.BugReporting.invocationEvent & Double] = js.native
    
    @js.native
    sealed trait floatingButton
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.invocationEvent
    /* 4 */ val floatingButton: typings.instabugReactnative.mod.BugReporting.invocationEvent.floatingButton & Double = js.native
    
    @js.native
    sealed trait none
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.invocationEvent
    /* 0 */ val none: typings.instabugReactnative.mod.BugReporting.invocationEvent.none & Double = js.native
    
    @js.native
    sealed trait screenshot
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.invocationEvent
    /* 2 */ val screenshot: typings.instabugReactnative.mod.BugReporting.invocationEvent.screenshot & Double = js.native
    
    @js.native
    sealed trait shake
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.invocationEvent
    /* 1 */ val shake: typings.instabugReactnative.mod.BugReporting.invocationEvent.shake & Double = js.native
    
    @js.native
    sealed trait twoFingersSwipe
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.invocationEvent
    /* 3 */ val twoFingersSwipe: typings.instabugReactnative.mod.BugReporting.invocationEvent.twoFingersSwipe & Double = js.native
  }
  
  @js.native
  sealed trait invocationOptions extends StObject
  @JSImport("instabug-reactnative", "BugReporting.invocationOptions")
  @js.native
  object invocationOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.instabugReactnative.mod.BugReporting.invocationOptions & Double] = js.native
    
    @js.native
    sealed trait commentFieldRequired
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.invocationOptions
    /* 2 */ val commentFieldRequired: typings.instabugReactnative.mod.BugReporting.invocationOptions.commentFieldRequired & Double = js.native
    
    @js.native
    sealed trait disablePostSendingDialog
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.invocationOptions
    /* 3 */ val disablePostSendingDialog: typings.instabugReactnative.mod.BugReporting.invocationOptions.disablePostSendingDialog & Double = js.native
    
    @js.native
    sealed trait emailFieldHidden
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.invocationOptions
    /* 0 */ val emailFieldHidden: typings.instabugReactnative.mod.BugReporting.invocationOptions.emailFieldHidden & Double = js.native
    
    @js.native
    sealed trait emailFieldOptional
      extends StObject
         with typings.instabugReactnative.mod.BugReporting.invocationOptions
    /* 1 */ val emailFieldOptional: typings.instabugReactnative.mod.BugReporting.invocationOptions.emailFieldOptional & Double = js.native
  }
  
  inline def onInvokeHandler(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onInvokeHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onReportSubmitHandler(preSendingHandler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onReportSubmitHandler")(preSendingHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onSDKDismissedHandler(handler: js.Function2[/* dismiss */ dismissType, /* report */ reportType, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSDKDismissedHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  sealed trait option extends StObject
  @JSImport("instabug-reactnative", "BugReporting.option")
  @js.native
  object option extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[option & Double] = js.native
    
    @js.native
    sealed trait commentFieldRequired
      extends StObject
         with option
    /* 2 */ val commentFieldRequired: typings.instabugReactnative.mod.BugReporting.option.commentFieldRequired & Double = js.native
    
    @js.native
    sealed trait disablePostSendingDialog
      extends StObject
         with option
    /* 3 */ val disablePostSendingDialog: typings.instabugReactnative.mod.BugReporting.option.disablePostSendingDialog & Double = js.native
    
    @js.native
    sealed trait emailFieldHidden
      extends StObject
         with option
    /* 0 */ val emailFieldHidden: typings.instabugReactnative.mod.BugReporting.option.emailFieldHidden & Double = js.native
    
    @js.native
    sealed trait emailFieldOptional
      extends StObject
         with option
    /* 1 */ val emailFieldOptional: typings.instabugReactnative.mod.BugReporting.option.emailFieldOptional & Double = js.native
  }
  
  @js.native
  sealed trait reportType extends StObject
  @JSImport("instabug-reactnative", "BugReporting.reportType")
  @js.native
  object reportType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[reportType & Double] = js.native
    
    @js.native
    sealed trait bug
      extends StObject
         with reportType
    /* 0 */ val bug: typings.instabugReactnative.mod.BugReporting.reportType.bug & Double = js.native
    
    @js.native
    sealed trait feedback
      extends StObject
         with reportType
    /* 1 */ val feedback: typings.instabugReactnative.mod.BugReporting.reportType.feedback & Double = js.native
    
    @js.native
    sealed trait question
      extends StObject
         with reportType
    /* 2 */ val question: typings.instabugReactnative.mod.BugReporting.reportType.question & Double = js.native
  }
  
  inline def setAutoScreenRecordingEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoScreenRecordingEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setDidSelectPromptOptionHandler(didSelectPromptOptionHandler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDidSelectPromptOptionHandler")(didSelectPromptOptionHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setExtendedBugReportMode(extendedBugReportMode: typings.instabugReactnative.mod.BugReporting.extendedBugReportMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtendedBugReportMode")(extendedBugReportMode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setInvocationEvents(invocationEvents: js.Array[typings.instabugReactnative.mod.BugReporting.invocationEvent]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInvocationEvents")(invocationEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setInvocationOptions(invocationOptions: js.Array[typings.instabugReactnative.mod.BugReporting.invocationOptions]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInvocationOptions")(invocationOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setReportTypes(types: js.Array[reportType]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setReportTypes")(types.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setShakingThresholdForAndroid(androidThreshold: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShakingThresholdForAndroid")(androidThreshold.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setShakingThresholdForiPad(iPadShakingThreshold: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShakingThresholdForiPad")(iPadShakingThreshold.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setShakingThresholdForiPhone(iPhoneShakingThreshold: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShakingThresholdForiPhone")(iPhoneShakingThreshold.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setViewHierarchyEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setViewHierarchyEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def show(`type`: reportType, options: js.Array[option]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def showWithOptions(`type`: reportType, options: js.Array[option]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showWithOptions")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
