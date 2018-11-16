package typings
package jqueryDotWindowLib.JQueryWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Button definition

trait Button extends js.Object {
  /**
  
          **/
  var clazz: js.UndefOr[java.lang.String] = js.undefined
  /**
  
          **/
  var id: java.lang.String
  /**
  
          **/
  var image: java.lang.String
  /**
  
          **/
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
  
          **/
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  
          **/
  def callback(btn: Button, wnd: Window): scala.Unit
}

