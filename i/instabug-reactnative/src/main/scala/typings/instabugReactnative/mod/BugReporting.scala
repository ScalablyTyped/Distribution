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
  /**
    *  The extended bug report mode
    * @readonly
    * @enum {number}
    */
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
  /**
    * The event used to invoke the feedback form
    * @readonly
    * @enum {number}
    */
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
  
  /**
    * Sets a block of code to be executed just before the SDK's UI is presented.
    * This block is executed on the UI thread. Could be used for performing any
    * UI changes before the SDK's UI is shown.
    * @param {function} handler - A callback that gets executed before invoking the SDK
    */
  inline def onInvokeHandler(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onInvokeHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets a block of code to be executed right after the SDK's UI is dismissed.
    * This block is executed on the UI thread. Could be used for performing any
    * UI changes after the SDK's UI is dismissed.
    * @param {function} handler - A callback to get executed after
    * dismissing the SDK.
    */
  inline def onSDKDismissedHandler(handler: js.Function2[/* dismiss */ dismissType, /* report */ reportType, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSDKDismissedHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  sealed trait option extends StObject
  /**
    * Options added while invoking bug reporting.
    * @readonly
    * @enum {number}
    */
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
  sealed trait position extends StObject
  /**
    * Instabug floating buttons positions.
    * @readonly
    * @enum {number}
    */
  @JSImport("instabug-reactnative", "BugReporting.position")
  @js.native
  object position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[position & Double] = js.native
    
    @js.native
    sealed trait bottomLeft
      extends StObject
         with position
    /* 2 */ val bottomLeft: typings.instabugReactnative.mod.BugReporting.position.bottomLeft & Double = js.native
    
    @js.native
    sealed trait bottomRight
      extends StObject
         with position
    /* 0 */ val bottomRight: typings.instabugReactnative.mod.BugReporting.position.bottomRight & Double = js.native
    
    @js.native
    sealed trait topLeft
      extends StObject
         with position
    /* 3 */ val topLeft: typings.instabugReactnative.mod.BugReporting.position.topLeft & Double = js.native
    
    @js.native
    sealed trait topRight
      extends StObject
         with position
    /* 1 */ val topRight: typings.instabugReactnative.mod.BugReporting.position.topRight & Double = js.native
  }
  
  @js.native
  sealed trait reportType extends StObject
  /**
    * Type of the report either feedback or bug.
    * @readonly
    * @enum {number}
    */
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
  
  /**
    * Sets auto screen recording maximum duration
    *
    * @param autoScreenRecordingMaxDuration maximum duration of the screen recording video
    *                                       in seconds
    * The maximum duration is 30 seconds
    */
  inline def setAutoScreenRecordingDurationIOS(autoScreenRecordingMaxDuration: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoScreenRecordingDurationIOS")(autoScreenRecordingMaxDuration.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Enable/Disable screen recording
    * @param {boolean} autoScreenRecordingEnabled boolean for enable/disable
    * screen recording on crash feature
    */
  inline def setAutoScreenRecordingEnabled(autoScreenRecordingEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoScreenRecordingEnabled")(autoScreenRecordingEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets a block of code to be executed when a prompt option is selected.
    * @param {function} didSelectPromptOptionHandler - A block of code that
    *                  gets executed when a prompt option is selected.
    */
  inline def setDidSelectPromptOptionHandler(didSelectPromptOptionHandler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDidSelectPromptOptionHandler")(didSelectPromptOptionHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Enables and disables manual invocation and prompt options for bug and feedback.
    * @param {boolean} isEnabled
    */
  inline def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets whether attachments in bug reporting and in-app messaging are enabled or not.
    * @param {boolean} screenshot A boolean to enable or disable screenshot attachments.
    * @param {boolean} extraScreenshot A boolean to enable or disable extra
    * screenshot attachments.
    * @param {boolean} galleryImage A boolean to enable or disable gallery image
    * attachments. In iOS 10+,NSPhotoLibraryUsageDescription should be set in
    * info.plist to enable gallery image attachments.
    * @param {boolean} screenRecording A boolean to enable or disable screen recording attachments.
    */
  inline def setEnabledAttachmentTypes(screenshot: Boolean, extraScreenshot: Boolean, galleryImage: Boolean, screenRecording: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEnabledAttachmentTypes")(screenshot.asInstanceOf[js.Any], extraScreenshot.asInstanceOf[js.Any], galleryImage.asInstanceOf[js.Any], screenRecording.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets whether the extended bug report mode should be disabled, enabled with
    * required fields or enabled with optional fields.
    * @param {extendedBugReportMode} extendedBugReportMode An enum to disable
    *                                the extended bug report mode, enable it
    *                                with required or with optional fields.
    */
  inline def setExtendedBugReportMode(extendedBugReportMode: typings.instabugReactnative.mod.BugReporting.extendedBugReportMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtendedBugReportMode")(extendedBugReportMode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the default edge and offset from the top at which the floating button
    * will be shown. Different orientations are already handled.
    * Default for `floatingButtonEdge` is `rectEdge.maxX`.
    * Default for `floatingButtonOffsetFromTop` is 50
    * @param {rectEdge} floatingButtonEdge `maxX` to show on the right,
    * or `minX` to show on the left.
    * @param {number} offsetFromTop floatingButtonOffsetFromTop Top offset for
    * floating button.
    */
  inline def setFloatingButtonEdge(floatingButtonEdge: Double, offsetFromTop: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFloatingButtonEdge")(floatingButtonEdge.asInstanceOf[js.Any], offsetFromTop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the events that invoke the feedback form.
    * Default is set by `Instabug.start`.
    * @param {invocationEvent} invocationEvents Array of events that invokes the
    * feedback form.
    */
  inline def setInvocationEvents(invocationEvents: js.Array[typings.instabugReactnative.mod.BugReporting.invocationEvent]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInvocationEvents")(invocationEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the invocation options.
    * Default is set by `Instabug.start`.
    * @param {options} options Array of options
    */
  inline def setOptions(options: js.Array[option]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets what type of reports, bug or feedback, should be invoked.
    * @param {array} types - Array of reportTypes
    */
  inline def setReportTypes(types: js.Array[reportType]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setReportTypes")(types.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the threshold value of the shake gesture for android devices.
    * Default for android is an integer value equals 350.
    * you could increase the shaking difficulty level by
    * increasing the `350` value and vice versa
    * @param {number} androidThreshold Threshold for android devices.
    */
  inline def setShakingThresholdForAndroid(androidThreshold: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShakingThresholdForAndroid")(androidThreshold.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the threshold value of the shake gesture for iPad.
    * Default for iPad is 0.6.
    * @param {number} iPadShakingThreshold Threshold for iPad.
    */
  inline def setShakingThresholdForiPad(iPadShakingThreshold: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShakingThresholdForiPad")(iPadShakingThreshold.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the threshold value of the shake gesture for iPhone/iPod Touch
    * Default for iPhone is 2.5.
    * @param {number} iPhoneShakingThreshold Threshold for iPhone.
    */
  inline def setShakingThresholdForiPhone(iPhoneShakingThreshold: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShakingThresholdForiPhone")(iPhoneShakingThreshold.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the default position at which the Instabug screen recording button will be shown.
    * Different orientations are already handled.
    * (Default for `position` is `bottomRight`)
    *
    * @param position is of type position `topLeft` to show on the top left of screen,
    * or `bottomRight` to show on the bottom right of scrren.
    */
  inline def setVideoRecordingFloatingButtonPosition(position: position): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVideoRecordingFloatingButtonPosition")(position.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @summary Enables/disables inspect view hierarchy when reporting a bug/feedback.
    * @param {boolean} viewHierarchyEnabled A boolean to set whether view hierarchy are enabled
    * or disabled.
    */
  inline def setViewHierarchyEnabled(viewHierarchyEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setViewHierarchyEnabled")(viewHierarchyEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Invoke bug reporting with report type and options.
    * @param {reportType} type 
    * @param {option} options 
    */
  inline def show(`type`: reportType, options: js.Array[option]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
