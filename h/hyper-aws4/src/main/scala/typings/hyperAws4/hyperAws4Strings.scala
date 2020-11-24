package typings.hyperAws4

import typings.hyperAws4.mod.HttpMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hyperAws4Strings {
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait DELETE extends HttpMethods
  
  @js.native
  sealed trait GET extends HttpMethods
  
  @js.native
  sealed trait PATCH extends HttpMethods
  
  @js.native
  sealed trait POST extends HttpMethods
  
  @js.native
  sealed trait PUT extends HttpMethods
}
