package typings.karmaMochaReporter

import typings.karmaMochaReporter.mod.OutputOptions
import typings.karmaMochaReporter.mod.ReporterColor
import typings.karmaMochaReporter.mod.ShowDiffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object karmaMochaReporterStrings {
  
  @js.native
  sealed trait autowatch
    extends StObject
       with OutputOptions
  inline def autowatch: autowatch = "autowatch".asInstanceOf[autowatch]
  
  @js.native
  sealed trait error
    extends StObject
       with ReporterColor
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait full
    extends StObject
       with OutputOptions
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait info
    extends StObject
       with ReporterColor
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait `inline`
    extends StObject
       with ShowDiffOptions
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait minimal
    extends StObject
       with OutputOptions
  inline def minimal: minimal = "minimal".asInstanceOf[minimal]
  
  @js.native
  sealed trait noFailures
    extends StObject
       with OutputOptions
  inline def noFailures: noFailures = "noFailures".asInstanceOf[noFailures]
  
  @js.native
  sealed trait success
    extends StObject
       with ReporterColor
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait unified
    extends StObject
       with ShowDiffOptions
  inline def unified: unified = "unified".asInstanceOf[unified]
  
  @js.native
  sealed trait warning
    extends StObject
       with ReporterColor
  inline def warning: warning = "warning".asInstanceOf[warning]
}
