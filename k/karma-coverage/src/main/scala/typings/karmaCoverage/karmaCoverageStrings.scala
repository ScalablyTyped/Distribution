package typings.karmaCoverage

import typings.karmaCoverage.mod.ReporterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object karmaCoverageStrings {
  @js.native
  sealed trait cobertura extends ReporterType
  
  @js.native
  sealed trait html extends ReporterType
  
  @js.native
  sealed trait `in-memory` extends ReporterType
  
  @js.native
  sealed trait json extends ReporterType
  
  @js.native
  sealed trait `json-summary` extends ReporterType
  
  @js.native
  sealed trait lcov extends ReporterType
  
  @js.native
  sealed trait lcovonly extends ReporterType
  
  @js.native
  sealed trait none extends ReporterType
  
  @js.native
  sealed trait teamcity extends ReporterType
  
  @js.native
  sealed trait text extends ReporterType
  
  @js.native
  sealed trait `text-summary` extends ReporterType
  
  @scala.inline
  def cobertura: cobertura = "cobertura".asInstanceOf[cobertura]
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def `in-memory`: `in-memory` = "in-memory".asInstanceOf[`in-memory`]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def `json-summary`: `json-summary` = "json-summary".asInstanceOf[`json-summary`]
  @scala.inline
  def lcov: lcov = "lcov".asInstanceOf[lcov]
  @scala.inline
  def lcovonly: lcovonly = "lcovonly".asInstanceOf[lcovonly]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def teamcity: teamcity = "teamcity".asInstanceOf[teamcity]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def `text-summary`: `text-summary` = "text-summary".asInstanceOf[`text-summary`]
}

