package typings
package hellojsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hellojsLibStrings {
  @js.native
  sealed trait code
    extends hellojsLib.hellojsMod.helloNs.HelloJSTokenResponseType
  
  @js.native
  sealed trait `code id_token`
    extends hellojsLib.hellojsMod.helloNs.HelloJSTokenResponseType
  
  @js.native
  sealed trait `code id_token token`
    extends hellojsLib.hellojsMod.helloNs.HelloJSTokenResponseType
  
  @js.native
  sealed trait `code token`
    extends hellojsLib.hellojsMod.helloNs.HelloJSTokenResponseType
  
  @js.native
  sealed trait id_token
    extends hellojsLib.hellojsMod.helloNs.HelloJSTokenResponseType
  
  @js.native
  sealed trait `id_token token`
    extends hellojsLib.hellojsMod.helloNs.HelloJSTokenResponseType
  
  @js.native
  sealed trait none
    extends hellojsLib.hellojsMod.helloNs.HelloJSDisplayType
       with hellojsLib.hellojsMod.helloNs.HelloJSTokenResponseType
  
  @js.native
  sealed trait page
    extends hellojsLib.hellojsMod.helloNs.HelloJSDisplayType
  
  @js.native
  sealed trait popup
    extends hellojsLib.hellojsMod.helloNs.HelloJSDisplayType
  
  @js.native
  sealed trait token
    extends hellojsLib.hellojsMod.helloNs.HelloJSTokenResponseType
  
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def `code id_token`: `code id_token` = "code id_token".asInstanceOf[`code id_token`]
  @scala.inline
  def `code id_token token`: `code id_token token` = "code id_token token".asInstanceOf[`code id_token token`]
  @scala.inline
  def `code token`: `code token` = "code token".asInstanceOf[`code token`]
  @scala.inline
  def id_token: id_token = "id_token".asInstanceOf[id_token]
  @scala.inline
  def `id_token token`: `id_token token` = "id_token token".asInstanceOf[`id_token token`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def page: page = "page".asInstanceOf[page]
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  @scala.inline
  def token: token = "token".asInstanceOf[token]
}

