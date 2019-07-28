package typings.jqueryDashToastmessageDashPlugin

import typings.jqueryDashToastmessageDashPlugin.JQueryToastmessageNs.ShowToastCommand
import typings.jqueryDashToastmessageDashPlugin.JQueryToastmessageNs.ToastPosition
import typings.jqueryDashToastmessageDashPlugin.JQueryToastmessageNs.ToastType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jqueryDashToastmessageDashPluginStrings {
  @js.native
  sealed trait error extends ToastType
  
  @js.native
  sealed trait `middle-center` extends ToastPosition
  
  @js.native
  sealed trait `middle-left` extends ToastPosition
  
  @js.native
  sealed trait `middle-right` extends ToastPosition
  
  @js.native
  sealed trait notice extends ToastType
  
  @js.native
  sealed trait removeToast extends js.Object
  
  @js.native
  sealed trait showErrorToast extends ShowToastCommand
  
  @js.native
  sealed trait showNoticeToast extends ShowToastCommand
  
  @js.native
  sealed trait showSuccessToast extends ShowToastCommand
  
  @js.native
  sealed trait showToast extends js.Object
  
  @js.native
  sealed trait showWarningToast extends ShowToastCommand
  
  @js.native
  sealed trait success extends ToastType
  
  @js.native
  sealed trait `top-center` extends ToastPosition
  
  @js.native
  sealed trait `top-left` extends ToastPosition
  
  @js.native
  sealed trait `top-right` extends ToastPosition
  
  @js.native
  sealed trait warning extends ToastType
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def `middle-center`: `middle-center` = "middle-center".asInstanceOf[`middle-center`]
  @scala.inline
  def `middle-left`: `middle-left` = "middle-left".asInstanceOf[`middle-left`]
  @scala.inline
  def `middle-right`: `middle-right` = "middle-right".asInstanceOf[`middle-right`]
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  @scala.inline
  def removeToast: removeToast = "removeToast".asInstanceOf[removeToast]
  @scala.inline
  def showErrorToast: showErrorToast = "showErrorToast".asInstanceOf[showErrorToast]
  @scala.inline
  def showNoticeToast: showNoticeToast = "showNoticeToast".asInstanceOf[showNoticeToast]
  @scala.inline
  def showSuccessToast: showSuccessToast = "showSuccessToast".asInstanceOf[showSuccessToast]
  @scala.inline
  def showToast: showToast = "showToast".asInstanceOf[showToast]
  @scala.inline
  def showWarningToast: showWarningToast = "showWarningToast".asInstanceOf[showWarningToast]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def `top-center`: `top-center` = "top-center".asInstanceOf[`top-center`]
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

