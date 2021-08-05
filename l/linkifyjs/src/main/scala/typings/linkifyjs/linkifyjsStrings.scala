package typings.linkifyjs

import typings.linkifyjs.mod.LinkEntityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkifyjsStrings {
  
  @js.native
  sealed trait abort extends StObject
  inline def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait email
    extends StObject
       with LinkEntityType
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait ftp extends StObject
  inline def ftp: ftp = "ftp".asInstanceOf[ftp]
  
  @js.native
  sealed trait ftps extends StObject
  inline def ftps: ftps = "ftps".asInstanceOf[ftps]
  
  @js.native
  sealed trait hashtag
    extends StObject
       with LinkEntityType
  inline def hashtag: hashtag = "hashtag".asInstanceOf[hashtag]
  
  @js.native
  sealed trait http extends StObject
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends StObject
  inline def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait mention
    extends StObject
       with LinkEntityType
  inline def mention: mention = "mention".asInstanceOf[mention]
  
  @js.native
  sealed trait url
    extends StObject
       with LinkEntityType
  inline def url: url = "url".asInstanceOf[url]
}
