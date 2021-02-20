package typings.jqueryToastmessagePlugin

import typings.jqueryToastmessagePlugin.JQueryToastmessage.ShowToastCommand
import typings.jqueryToastmessagePlugin.JQueryToastmessage.ToastPosition
import typings.jqueryToastmessagePlugin.JQueryToastmessage.ToastType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jqueryToastmessagePluginStrings {
  
  @js.native
  sealed trait error extends ToastType
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait `middle-center` extends ToastPosition
  @scala.inline
  def `middle-center`: `middle-center` = "middle-center".asInstanceOf[`middle-center`]
  
  @js.native
  sealed trait `middle-left` extends ToastPosition
  @scala.inline
  def `middle-left`: `middle-left` = "middle-left".asInstanceOf[`middle-left`]
  
  @js.native
  sealed trait `middle-right` extends ToastPosition
  @scala.inline
  def `middle-right`: `middle-right` = "middle-right".asInstanceOf[`middle-right`]
  
  @js.native
  sealed trait notice extends ToastType
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait removeToast extends StObject
  @scala.inline
  def removeToast: removeToast = "removeToast".asInstanceOf[removeToast]
  
  @js.native
  sealed trait showErrorToast extends ShowToastCommand
  @scala.inline
  def showErrorToast: showErrorToast = "showErrorToast".asInstanceOf[showErrorToast]
  
  @js.native
  sealed trait showNoticeToast extends ShowToastCommand
  @scala.inline
  def showNoticeToast: showNoticeToast = "showNoticeToast".asInstanceOf[showNoticeToast]
  
  @js.native
  sealed trait showSuccessToast extends ShowToastCommand
  @scala.inline
  def showSuccessToast: showSuccessToast = "showSuccessToast".asInstanceOf[showSuccessToast]
  
  @js.native
  sealed trait showToast extends StObject
  @scala.inline
  def showToast: showToast = "showToast".asInstanceOf[showToast]
  
  @js.native
  sealed trait showWarningToast extends ShowToastCommand
  @scala.inline
  def showWarningToast: showWarningToast = "showWarningToast".asInstanceOf[showWarningToast]
  
  @js.native
  sealed trait success extends ToastType
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait `top-center` extends ToastPosition
  @scala.inline
  def `top-center`: `top-center` = "top-center".asInstanceOf[`top-center`]
  
  @js.native
  sealed trait `top-left` extends ToastPosition
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @js.native
  sealed trait `top-right` extends ToastPosition
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @js.native
  sealed trait warning extends ToastType
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}
