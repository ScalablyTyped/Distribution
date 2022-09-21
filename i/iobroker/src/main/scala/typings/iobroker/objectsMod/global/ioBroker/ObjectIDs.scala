package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotDollarLeftcurlybracketstringRightcurlybracket
import typings.iobroker.iobrokerStrings.`systemDot$LeftcurlybracketQuotationmarkcertificatesQuotationmark Verticalline QuotationmarkconfigQuotationmark Verticalline QuotationmarkrepositoriesQuotationmarkRightcurlybracket`
import typings.iobroker.iobrokerStrings.enumDot$LeftcurlybracketstringRightcurlybracket
import typings.iobroker.iobrokerStrings.scriptDotjsDot$LeftcurlybracketstringRightcurlybracket
import typings.iobroker.iobrokerStrings.systemDotadapterDot$LeftcurlybracketstringRightcurlybracket
import typings.iobroker.iobrokerStrings.systemDotadapterDotDollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracket
import typings.iobroker.iobrokerStrings.systemDotadapterDotDollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotDollarLeftcurlybracketstringRightcurlybracket
import typings.iobroker.iobrokerStrings.systemDotgroupDot$LeftcurlybracketstringRightcurlybracket
import typings.iobroker.iobrokerStrings.systemDothostDot$LeftcurlybracketstringRightcurlybracket
import typings.iobroker.iobrokerStrings.systemDotuserDot$LeftcurlybracketstringRightcurlybracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Define the naming schemes for objects so we can provide more specific types for get/setObject
object ObjectIDs {
  
  // Guaranteed adapter objects
  type Adapter = systemDotadapterDot$LeftcurlybracketstringRightcurlybracket
  
  // Unsure, can be folder, device, channel or state (or whatever an adapter does)
  type AdapterScoped = DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotDollarLeftcurlybracketstringRightcurlybracket
  
  /** All possible typed object IDs */
  /* Rewritten from type alias, can be one of: 
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.Meta
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.Misc
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.Channel
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.ScriptOrChannel
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.State
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.Enum
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.Instance
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.Adapter
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.Group
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.User
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.Host
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.Config
    - typings.iobroker.objectsMod.global.ioBroker.ObjectIDs.AdapterScoped
  */
  type Any = _Any | ScriptOrChannel | State | Enum | Instance | Adapter | Group | User | Host | Config | AdapterScoped
  
  // Guaranteed channel objects
  /* Rewritten from type alias, can be one of: 
    - typings.iobroker.iobrokerStrings.`scriptDotjsDot$LeftcurlybracketQuotationmarkcommonQuotationmark Verticalline QuotationmarkglobalQuotationmarkRightcurlybracket`
    - typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotinfo
  */
  trait Channel
    extends StObject
       with _Any
  object Channel {
    
    inline def DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotinfo: typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotinfo = "${string}.${number}.info".asInstanceOf[typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotinfo]
    
    inline def `scriptDotjsDot$LeftcurlybracketQuotationmarkcommonQuotationmark Verticalline QuotationmarkglobalQuotationmarkRightcurlybracket`: typings.iobroker.iobrokerStrings.`scriptDotjsDot$LeftcurlybracketQuotationmarkcommonQuotationmark Verticalline QuotationmarkglobalQuotationmarkRightcurlybracket` = ("script.js.${\"common\" | \"global\"}").asInstanceOf[typings.iobroker.iobrokerStrings.`scriptDotjsDot$LeftcurlybracketQuotationmarkcommonQuotationmark Verticalline QuotationmarkglobalQuotationmarkRightcurlybracket`]
  }
  
  // Guaranteed config objects
  type Config = `systemDot$LeftcurlybracketQuotationmarkcertificatesQuotationmark Verticalline QuotationmarkconfigQuotationmark Verticalline QuotationmarkrepositoriesQuotationmarkRightcurlybracket`
  
  // Guaranteed enum objects
  type Enum = enumDot$LeftcurlybracketstringRightcurlybracket
  
  // Guaranteed group objects
  type Group = systemDotgroupDot$LeftcurlybracketstringRightcurlybracket
  
  // Guaranteed host objects
  type Host = systemDothostDot$LeftcurlybracketstringRightcurlybracket
  
  // Guaranteed instance objects
  type Instance = systemDotadapterDotDollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracket
  
  // Guaranteed meta objects
  /* Rewritten from type alias, can be one of: 
    - typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracket
    - typings.iobroker.iobrokerStrings.`DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketQuotationmarkmetaQuotationmark Verticalline QuotationmarkadminQuotationmarkRightcurlybracket`
    - typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotmetaDotDollarLeftcurlybracketstringRightcurlybracket
    - typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotmetaDotDollarLeftcurlybracketstringRightcurlybracket
  */
  trait Meta
    extends StObject
       with _Any
  object Meta {
    
    inline def `DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketQuotationmarkmetaQuotationmark Verticalline QuotationmarkadminQuotationmarkRightcurlybracket`: typings.iobroker.iobrokerStrings.`DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketQuotationmarkmetaQuotationmark Verticalline QuotationmarkadminQuotationmarkRightcurlybracket` = ("${string}.${\"meta\" | \"admin\"}").asInstanceOf[typings.iobroker.iobrokerStrings.`DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketQuotationmarkmetaQuotationmark Verticalline QuotationmarkadminQuotationmarkRightcurlybracket`]
    
    inline def DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracket: typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracket = "${string}.${number}".asInstanceOf[typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracket]
    
    inline def DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotmetaDotDollarLeftcurlybracketstringRightcurlybracket: typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotmetaDotDollarLeftcurlybracketstringRightcurlybracket = "${string}.${number}.meta.${string}".asInstanceOf[typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotmetaDotDollarLeftcurlybracketstringRightcurlybracket]
    
    inline def DollarLeftcurlybracketstringRightcurlybracketDotmetaDotDollarLeftcurlybracketstringRightcurlybracket: typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotmetaDotDollarLeftcurlybracketstringRightcurlybracket = "${string}.meta.${string}".asInstanceOf[typings.iobroker.iobrokerStrings.DollarLeftcurlybracketstringRightcurlybracketDotmetaDotDollarLeftcurlybracketstringRightcurlybracket]
  }
  
  // Unsure, can be folder, device, channel or state
  // --> We need this match to avoid matching the more specific types below
  /* Rewritten from type alias, can be one of: 
    - typings.iobroker.iobrokerStrings.systemDothostDotDollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketstringRightcurlybracket
    - typings.iobroker.iobrokerStrings.`0_userdataDot0Dot$LeftcurlybracketstringRightcurlybracket`
  */
  trait Misc
    extends StObject
       with _Any
  object Misc {
    
    inline def `0_userdataDot0Dot$LeftcurlybracketstringRightcurlybracket`: typings.iobroker.iobrokerStrings.`0_userdataDot0Dot$LeftcurlybracketstringRightcurlybracket` = "0_userdata.0.${string}".asInstanceOf[typings.iobroker.iobrokerStrings.`0_userdataDot0Dot$LeftcurlybracketstringRightcurlybracket`]
    
    inline def systemDothostDotDollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketstringRightcurlybracket: typings.iobroker.iobrokerStrings.systemDothostDotDollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketstringRightcurlybracket = "system.host.${string}.${string}".asInstanceOf[typings.iobroker.iobrokerStrings.systemDothostDotDollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketstringRightcurlybracket]
  }
  
  // Either script or channel object
  type ScriptOrChannel = scriptDotjsDot$LeftcurlybracketstringRightcurlybracket
  
  // Guaranteed state objects
  type State = systemDotadapterDotDollarLeftcurlybracketstringRightcurlybracketDotDollarLeftcurlybracketnumberRightcurlybracketDotDollarLeftcurlybracketstringRightcurlybracket
  
  // Guaranteed user objects
  type User = systemDotuserDot$LeftcurlybracketstringRightcurlybracket
  
  trait _Any extends StObject
}
