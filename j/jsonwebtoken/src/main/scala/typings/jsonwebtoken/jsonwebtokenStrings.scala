package typings.jsonwebtoken

import typings.jsonwebtoken.mod.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsonwebtokenStrings {
  @js.native
  sealed trait ES256 extends Algorithm
  
  @js.native
  sealed trait ES384 extends Algorithm
  
  @js.native
  sealed trait ES512 extends Algorithm
  
  @js.native
  sealed trait HS256 extends Algorithm
  
  @js.native
  sealed trait HS384 extends Algorithm
  
  @js.native
  sealed trait HS512 extends Algorithm
  
  @js.native
  sealed trait PS256 extends Algorithm
  
  @js.native
  sealed trait PS384 extends Algorithm
  
  @js.native
  sealed trait PS512 extends Algorithm
  
  @js.native
  sealed trait RS256 extends Algorithm
  
  @js.native
  sealed trait RS384 extends Algorithm
  
  @js.native
  sealed trait RS512 extends Algorithm
  
  @js.native
  sealed trait none extends Algorithm
  
  @scala.inline
  def ES256: ES256 = "ES256".asInstanceOf[ES256]
  @scala.inline
  def ES384: ES384 = "ES384".asInstanceOf[ES384]
  @scala.inline
  def ES512: ES512 = "ES512".asInstanceOf[ES512]
  @scala.inline
  def HS256: HS256 = "HS256".asInstanceOf[HS256]
  @scala.inline
  def HS384: HS384 = "HS384".asInstanceOf[HS384]
  @scala.inline
  def HS512: HS512 = "HS512".asInstanceOf[HS512]
  @scala.inline
  def PS256: PS256 = "PS256".asInstanceOf[PS256]
  @scala.inline
  def PS384: PS384 = "PS384".asInstanceOf[PS384]
  @scala.inline
  def PS512: PS512 = "PS512".asInstanceOf[PS512]
  @scala.inline
  def RS256: RS256 = "RS256".asInstanceOf[RS256]
  @scala.inline
  def RS384: RS384 = "RS384".asInstanceOf[RS384]
  @scala.inline
  def RS512: RS512 = "RS512".asInstanceOf[RS512]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
}

