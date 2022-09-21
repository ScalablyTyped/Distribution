package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Intl$Collator")
@js.native
open class IntlCollator () extends StObject {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: CollatorOptions) = this()
  def this(locales: js.Array[String], options: CollatorOptions) = this()
  def this(locales: scala.Unit, options: CollatorOptions) = this()
  
  def compare(a: String, b: String): Double = js.native
  
  def resolvedOptions(): Any = js.native
}
