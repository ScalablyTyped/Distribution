package typings.httpBasic

import typings.httpBasic.httpVerbMod.HttpVerb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpBasicStrings {
  
  @scala.inline
  def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @scala.inline
  def memory: memory = "memory".asInstanceOf[memory]
  
  @js.native
  sealed trait CONNECT extends HttpVerb
  
  @js.native
  sealed trait DELETE extends HttpVerb
  
  @js.native
  sealed trait GET extends HttpVerb
  
  @js.native
  sealed trait HEAD extends HttpVerb
  
  @js.native
  sealed trait OPTIONS extends HttpVerb
  
  @js.native
  sealed trait PATCH extends HttpVerb
  
  @js.native
  sealed trait POST extends HttpVerb
  
  @js.native
  sealed trait PUT extends HttpVerb
  
  @js.native
  sealed trait TRACE extends HttpVerb
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait memory extends js.Object
}
