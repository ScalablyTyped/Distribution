package typings.hellojs

import typings.hellojs.mod.HelloJSDisplayType
import typings.hellojs.mod.HelloJSTokenResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hellojsStrings {
  
  @js.native
  sealed trait code extends HelloJSTokenResponseType
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait `code id_token` extends HelloJSTokenResponseType
  @scala.inline
  def `code id_token`: `code id_token` = ("code id_token").asInstanceOf[`code id_token`]
  
  @js.native
  sealed trait `code id_token token` extends HelloJSTokenResponseType
  @scala.inline
  def `code id_token token`: `code id_token token` = ("code id_token token").asInstanceOf[`code id_token token`]
  
  @js.native
  sealed trait `code token` extends HelloJSTokenResponseType
  @scala.inline
  def `code token`: `code token` = ("code token").asInstanceOf[`code token`]
  
  @js.native
  sealed trait id_token extends HelloJSTokenResponseType
  @scala.inline
  def id_token: id_token = "id_token".asInstanceOf[id_token]
  
  @js.native
  sealed trait `id_token token` extends HelloJSTokenResponseType
  @scala.inline
  def `id_token token`: `id_token token` = ("id_token token").asInstanceOf[`id_token token`]
  
  @js.native
  sealed trait none
    extends HelloJSDisplayType
       with HelloJSTokenResponseType
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait page extends HelloJSDisplayType
  @scala.inline
  def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait popup extends HelloJSDisplayType
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait token extends HelloJSTokenResponseType
  @scala.inline
  def token: token = "token".asInstanceOf[token]
}
