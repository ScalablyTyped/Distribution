package typings.httpParserJs

import typings.httpParserJs.mod.ParserType
import typings.httpParserJs.mod.StateFinishAllowedKey
import typings.httpParserJs.mod.StateHeaderKey
import typings.httpParserJs.mod._RequestMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpParserJsStrings {
  
  @js.native
  sealed trait ACL
    extends StObject
       with _RequestMethod
  inline def ACL: ACL = "ACL".asInstanceOf[ACL]
  
  @js.native
  sealed trait BIND
    extends StObject
       with _RequestMethod
  inline def BIND: BIND = "BIND".asInstanceOf[BIND]
  
  @js.native
  sealed trait BODY_RAW
    extends StObject
       with StateFinishAllowedKey
  inline def BODY_RAW: BODY_RAW = "BODY_RAW".asInstanceOf[BODY_RAW]
  
  @js.native
  sealed trait CHECKOUT
    extends StObject
       with _RequestMethod
  inline def CHECKOUT: CHECKOUT = "CHECKOUT".asInstanceOf[CHECKOUT]
  
  @js.native
  sealed trait CONNECT
    extends StObject
       with _RequestMethod
  inline def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  
  @js.native
  sealed trait COPY
    extends StObject
       with _RequestMethod
  inline def COPY: COPY = "COPY".asInstanceOf[COPY]
  
  @js.native
  sealed trait DELETE
    extends StObject
       with _RequestMethod
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with _RequestMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD
    extends StObject
       with _RequestMethod
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait HEADER
    extends StObject
       with StateHeaderKey
  inline def HEADER: HEADER = "HEADER".asInstanceOf[HEADER]
  
  @js.native
  sealed trait LINK
    extends StObject
       with _RequestMethod
  inline def LINK: LINK = "LINK".asInstanceOf[LINK]
  
  @js.native
  sealed trait LOCK
    extends StObject
       with _RequestMethod
  inline def LOCK: LOCK = "LOCK".asInstanceOf[LOCK]
  
  @js.native
  sealed trait `M-SEARCH`
    extends StObject
       with _RequestMethod
  inline def `M-SEARCH`: `M-SEARCH` = "M-SEARCH".asInstanceOf[`M-SEARCH`]
  
  @js.native
  sealed trait MERGE
    extends StObject
       with _RequestMethod
  inline def MERGE: MERGE = "MERGE".asInstanceOf[MERGE]
  
  @js.native
  sealed trait MKACTIVITY
    extends StObject
       with _RequestMethod
  inline def MKACTIVITY: MKACTIVITY = "MKACTIVITY".asInstanceOf[MKACTIVITY]
  
  @js.native
  sealed trait MKCALENDAR
    extends StObject
       with _RequestMethod
  inline def MKCALENDAR: MKCALENDAR = "MKCALENDAR".asInstanceOf[MKCALENDAR]
  
  @js.native
  sealed trait MKCOL
    extends StObject
       with _RequestMethod
  inline def MKCOL: MKCOL = "MKCOL".asInstanceOf[MKCOL]
  
  @js.native
  sealed trait MOVE
    extends StObject
       with _RequestMethod
  inline def MOVE: MOVE = "MOVE".asInstanceOf[MOVE]
  
  @js.native
  sealed trait NOTIFY
    extends StObject
       with _RequestMethod
  inline def NOTIFY: NOTIFY = "NOTIFY".asInstanceOf[NOTIFY]
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with _RequestMethod
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with _RequestMethod
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends StObject
       with _RequestMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PROPFIND
    extends StObject
       with _RequestMethod
  inline def PROPFIND: PROPFIND = "PROPFIND".asInstanceOf[PROPFIND]
  
  @js.native
  sealed trait PROPPATCH
    extends StObject
       with _RequestMethod
  inline def PROPPATCH: PROPPATCH = "PROPPATCH".asInstanceOf[PROPPATCH]
  
  @js.native
  sealed trait PURGE
    extends StObject
       with _RequestMethod
  inline def PURGE: PURGE = "PURGE".asInstanceOf[PURGE]
  
  @js.native
  sealed trait PUT
    extends StObject
       with _RequestMethod
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait REBIND
    extends StObject
       with _RequestMethod
  inline def REBIND: REBIND = "REBIND".asInstanceOf[REBIND]
  
  @js.native
  sealed trait REPORT
    extends StObject
       with _RequestMethod
  inline def REPORT: REPORT = "REPORT".asInstanceOf[REPORT]
  
  @js.native
  sealed trait REQUEST
    extends StObject
       with ParserType
  inline def REQUEST: REQUEST = "REQUEST".asInstanceOf[REQUEST]
  
  @js.native
  sealed trait REQUEST_LINE
    extends StObject
       with StateFinishAllowedKey
       with StateHeaderKey
  inline def REQUEST_LINE: REQUEST_LINE = "REQUEST_LINE".asInstanceOf[REQUEST_LINE]
  
  @js.native
  sealed trait RESPONSE
    extends StObject
       with ParserType
  inline def RESPONSE: RESPONSE = "RESPONSE".asInstanceOf[RESPONSE]
  
  @js.native
  sealed trait RESPONSE_LINE
    extends StObject
       with StateFinishAllowedKey
       with StateHeaderKey
  inline def RESPONSE_LINE: RESPONSE_LINE = "RESPONSE_LINE".asInstanceOf[RESPONSE_LINE]
  
  @js.native
  sealed trait SEARCH
    extends StObject
       with _RequestMethod
  inline def SEARCH: SEARCH = "SEARCH".asInstanceOf[SEARCH]
  
  @js.native
  sealed trait SUBSCRIBE
    extends StObject
       with _RequestMethod
  inline def SUBSCRIBE: SUBSCRIBE = "SUBSCRIBE".asInstanceOf[SUBSCRIBE]
  
  @js.native
  sealed trait TRACE
    extends StObject
       with _RequestMethod
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait UNBIND
    extends StObject
       with _RequestMethod
  inline def UNBIND: UNBIND = "UNBIND".asInstanceOf[UNBIND]
  
  @js.native
  sealed trait UNLINK
    extends StObject
       with _RequestMethod
  inline def UNLINK: UNLINK = "UNLINK".asInstanceOf[UNLINK]
  
  @js.native
  sealed trait UNLOCK
    extends StObject
       with _RequestMethod
  inline def UNLOCK: UNLOCK = "UNLOCK".asInstanceOf[UNLOCK]
  
  @js.native
  sealed trait UNSUBSCRIBE
    extends StObject
       with _RequestMethod
  inline def UNSUBSCRIBE: UNSUBSCRIBE = "UNSUBSCRIBE".asInstanceOf[UNSUBSCRIBE]
  
  @js.native
  sealed trait ascii extends StObject
  inline def ascii: ascii = "ascii".asInstanceOf[ascii]
}
