package typings.jsmediatags

import typings.jsmediatags.typesMod.CharsetType
import typings.jsmediatags.typesMod.ShortcutNameType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsmediatagsStrings {
  @js.native
  sealed trait album extends ShortcutNameType
  
  @js.native
  sealed trait artist extends ShortcutNameType
  
  @js.native
  sealed trait comment extends ShortcutNameType
  
  @js.native
  sealed trait genre extends ShortcutNameType
  
  @js.native
  sealed trait `iso-8859-1` extends CharsetType
  
  @js.native
  sealed trait lyrics extends ShortcutNameType
  
  @js.native
  sealed trait picture extends ShortcutNameType
  
  @js.native
  sealed trait title extends ShortcutNameType
  
  @js.native
  sealed trait track extends ShortcutNameType
  
  @js.native
  sealed trait `utf-16` extends CharsetType
  
  @js.native
  sealed trait `utf-16be` extends CharsetType
  
  @js.native
  sealed trait `utf-16le` extends CharsetType
  
  @js.native
  sealed trait `utf-8` extends CharsetType
  
  @js.native
  sealed trait year extends ShortcutNameType
  
  @scala.inline
  def album: album = "album".asInstanceOf[album]
  @scala.inline
  def artist: artist = "artist".asInstanceOf[artist]
  @scala.inline
  def comment: comment = "comment".asInstanceOf[comment]
  @scala.inline
  def genre: genre = "genre".asInstanceOf[genre]
  @scala.inline
  def `iso-8859-1`: `iso-8859-1` = "iso-8859-1".asInstanceOf[`iso-8859-1`]
  @scala.inline
  def lyrics: lyrics = "lyrics".asInstanceOf[lyrics]
  @scala.inline
  def picture: picture = "picture".asInstanceOf[picture]
  @scala.inline
  def title: title = "title".asInstanceOf[title]
  @scala.inline
  def track: track = "track".asInstanceOf[track]
  @scala.inline
  def `utf-16`: `utf-16` = "utf-16".asInstanceOf[`utf-16`]
  @scala.inline
  def `utf-16be`: `utf-16be` = "utf-16be".asInstanceOf[`utf-16be`]
  @scala.inline
  def `utf-16le`: `utf-16le` = "utf-16le".asInstanceOf[`utf-16le`]
  @scala.inline
  def `utf-8`: `utf-8` = "utf-8".asInstanceOf[`utf-8`]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
}

