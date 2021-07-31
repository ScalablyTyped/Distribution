package typings.ioredis

import typings.ioredis.mod.NodeRole
import typings.ioredis.mod.SecureVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioredisStrings {
  
  @js.native
  sealed trait AFTER extends StObject
  @scala.inline
  def AFTER: AFTER = "AFTER".asInstanceOf[AFTER]
  
  @js.native
  sealed trait BEFORE extends StObject
  @scala.inline
  def BEFORE: BEFORE = "BEFORE".asInstanceOf[BEFORE]
  
  @js.native
  sealed trait COUNT extends StObject
  @scala.inline
  def COUNT: COUNT = "COUNT".asInstanceOf[COUNT]
  
  @js.native
  sealed trait GET extends StObject
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait GROUP extends StObject
  @scala.inline
  def GROUP: GROUP = "GROUP".asInstanceOf[GROUP]
  
  @js.native
  sealed trait LIMIT extends StObject
  @scala.inline
  def LIMIT: LIMIT = "LIMIT".asInstanceOf[LIMIT]
  
  @js.native
  sealed trait MATCH extends StObject
  @scala.inline
  def MATCH: MATCH = "MATCH".asInstanceOf[MATCH]
  
  @js.native
  sealed trait MAXLEN extends StObject
  @scala.inline
  def MAXLEN: MAXLEN = "MAXLEN".asInstanceOf[MAXLEN]
  
  @js.native
  sealed trait NOKEY extends StObject
  @scala.inline
  def NOKEY: NOKEY = "NOKEY".asInstanceOf[NOKEY]
  
  @js.native
  sealed trait NOSAVE extends StObject
  @scala.inline
  def NOSAVE: NOSAVE = "NOSAVE".asInstanceOf[NOSAVE]
  
  @js.native
  sealed trait OK extends StObject
  @scala.inline
  def OK: OK = "OK".asInstanceOf[OK]
  
  @js.native
  sealed trait RESETSTAT extends StObject
  @scala.inline
  def RESETSTAT: RESETSTAT = "RESETSTAT".asInstanceOf[RESETSTAT]
  
  @js.native
  sealed trait REWRITE extends StObject
  @scala.inline
  def REWRITE: REWRITE = "REWRITE".asInstanceOf[REWRITE]
  
  @js.native
  sealed trait SAVE extends StObject
  @scala.inline
  def SAVE: SAVE = "SAVE".asInstanceOf[SAVE]
  
  @js.native
  sealed trait SET extends StObject
  @scala.inline
  def SET: SET = "SET".asInstanceOf[SET]
  
  @js.native
  sealed trait TLSv1
    extends StObject
       with SecureVersion
  @scala.inline
  def TLSv1: TLSv1 = "TLSv1".asInstanceOf[TLSv1]
  
  @js.native
  sealed trait TLSv1Dot1
    extends StObject
       with SecureVersion
  @scala.inline
  def TLSv1Dot1: TLSv1Dot1 = "TLSv1.1".asInstanceOf[TLSv1Dot1]
  
  @js.native
  sealed trait TLSv1Dot2
    extends StObject
       with SecureVersion
  @scala.inline
  def TLSv1Dot2: TLSv1Dot2 = "TLSv1.2".asInstanceOf[TLSv1Dot2]
  
  @js.native
  sealed trait TLSv1Dot3
    extends StObject
       with SecureVersion
  @scala.inline
  def TLSv1Dot3: TLSv1Dot3 = "TLSv1.3".asInstanceOf[TLSv1Dot3]
  
  @js.native
  sealed trait USAGE extends StObject
  @scala.inline
  def USAGE: USAGE = "USAGE".asInstanceOf[USAGE]
  
  @js.native
  sealed trait WITHSCORES extends StObject
  @scala.inline
  def WITHSCORES: WITHSCORES = "WITHSCORES".asInstanceOf[WITHSCORES]
  
  @js.native
  sealed trait all
    extends StObject
       with NodeRole
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait count_ extends StObject
  @scala.inline
  def count_ : count_ = "count".asInstanceOf[count_]
  
  @js.native
  sealed trait group_ extends StObject
  @scala.inline
  def group_ : group_ = "group".asInstanceOf[group_]
  
  @js.native
  sealed trait master
    extends StObject
       with NodeRole
  @scala.inline
  def master: master = "master".asInstanceOf[master]
  
  @js.native
  sealed trait match_ extends StObject
  @scala.inline
  def match_ : match_ = "match".asInstanceOf[match_]
  
  @js.native
  sealed trait maxlen_ extends StObject
  @scala.inline
  def maxlen_ : maxlen_ = "maxlen".asInstanceOf[maxlen_]
  
  @js.native
  sealed trait slave
    extends StObject
       with NodeRole
  @scala.inline
  def slave: slave = "slave".asInstanceOf[slave]
}
