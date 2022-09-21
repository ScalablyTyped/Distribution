package typings.jsreportCore

import typings.jsreportCore.mod.EngineStrategy
import typings.jsreportCore.mod.ReporterOptionsBlobStorageProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsreportCoreStrings {
  
  @js.native
  sealed trait content extends StObject
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait `dedicated-process`
    extends StObject
       with EngineStrategy
  inline def `dedicated-process`: `dedicated-process` = "dedicated-process".asInstanceOf[`dedicated-process`]
  
  @js.native
  sealed trait fs
    extends StObject
       with ReporterOptionsBlobStorageProvider
  inline def fs: fs = "fs".asInstanceOf[fs]
  
  @js.native
  sealed trait html extends StObject
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait `http-server`
    extends StObject
       with EngineStrategy
  inline def `http-server`: `http-server` = "http-server".asInstanceOf[`http-server`]
  
  @js.native
  sealed trait `in-process`
    extends StObject
       with EngineStrategy
  inline def `in-process`: `in-process` = "in-process".asInstanceOf[`in-process`]
  
  @js.native
  sealed trait memory
    extends StObject
       with ReporterOptionsBlobStorageProvider
  inline def memory: memory = "memory".asInstanceOf[memory]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
}
