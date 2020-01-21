package typings.linkifyjs

import typings.linkifyjs.mod.LinkEntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object linkifyjsStrings {
  @js.native
  sealed trait email extends LinkEntityType
  
  @js.native
  sealed trait ftp extends js.Object
  
  @js.native
  sealed trait ftps extends js.Object
  
  @js.native
  sealed trait hashtag extends LinkEntityType
  
  @js.native
  sealed trait http extends js.Object
  
  @js.native
  sealed trait https extends js.Object
  
  @js.native
  sealed trait mention extends LinkEntityType
  
  @js.native
  sealed trait url extends LinkEntityType
  
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def ftp: ftp = "ftp".asInstanceOf[ftp]
  @scala.inline
  def ftps: ftps = "ftps".asInstanceOf[ftps]
  @scala.inline
  def hashtag: hashtag = "hashtag".asInstanceOf[hashtag]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def mention: mention = "mention".asInstanceOf[mention]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
}

