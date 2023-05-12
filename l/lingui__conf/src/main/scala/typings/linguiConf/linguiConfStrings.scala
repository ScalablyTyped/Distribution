package typings.linguiConf

import typings.linguiConf.mod.CatalogFormat
import typings.linguiConf.mod.OrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linguiConfStrings {
  
  @js.native
  sealed trait cjs extends StObject
  inline def cjs: cjs = "cjs".asInstanceOf[cjs]
  
  @js.native
  sealed trait csv
    extends StObject
       with CatalogFormat
  inline def csv: csv = "csv".asInstanceOf[csv]
  
  @js.native
  sealed trait es extends StObject
  inline def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait lingui
    extends StObject
       with CatalogFormat
  inline def lingui: lingui = "lingui".asInstanceOf[lingui]
  
  @js.native
  sealed trait message
    extends StObject
       with OrderBy
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait messageId
    extends StObject
       with OrderBy
  inline def messageId: messageId = "messageId".asInstanceOf[messageId]
  
  @js.native
  sealed trait minimal
    extends StObject
       with CatalogFormat
  inline def minimal: minimal = "minimal".asInstanceOf[minimal]
  
  @js.native
  sealed trait origin
    extends StObject
       with OrderBy
  inline def origin: origin = "origin".asInstanceOf[origin]
  
  @js.native
  sealed trait po
    extends StObject
       with CatalogFormat
  inline def po: po = "po".asInstanceOf[po]
  
  @js.native
  sealed trait `po-gettext`
    extends StObject
       with CatalogFormat
  inline def `po-gettext`: `po-gettext` = "po-gettext".asInstanceOf[`po-gettext`]
  
  @js.native
  sealed trait ts extends StObject
  inline def ts: ts = "ts".asInstanceOf[ts]
}
