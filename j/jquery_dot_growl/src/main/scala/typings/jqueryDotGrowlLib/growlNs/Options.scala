package typings
package jqueryDotGrowlLib.growlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  // while hovering over the alert, prevent it from being dismissed (true | false - default: true)
  var delayOnHover: js.UndefOr[scala.Boolean] = js.undefined
  // the duration (in milliseconds) for which the alert is displayed (default: 3200)
  var duration: js.UndefOr[scala.Double] = js.undefined
  // whether the alert should be fixed rather than auto- dismissed(true | false - default: false)
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  // the alert's position ('tl' | 'tr' | 'bl' | 'br' | 'tc' | 'bc' - default: 'tr')
  var location: js.UndefOr[java.lang.String] = js.undefined
  // Message
  var message: java.lang.String
  // the alert's size ('small' | 'medium' | 'large' - default: 'medium')
  var size: js.UndefOr[java.lang.String] = js.undefined
  // the alert's style ('default' | 'error' | 'notice' | 'warning' - default: 'default')
  var style: js.UndefOr[java.lang.String] = js.undefined
  // Title
  var title: js.UndefOr[java.lang.String] = js.undefined
  // URL
  var url: js.UndefOr[java.lang.String] = js.undefined
}

