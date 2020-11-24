package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BackButtonEvent = typings.std.CustomEvent[typings.ionicCore.mod.BackButtonEventDetail]
  
  type Color = typings.ionicCore.mod.PredefinedColors | java.lang.String
  
  type ComponentProps[T] = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ComponentRef = js.Function | typings.std.HTMLElement | java.lang.String | scala.Null
  
  type ComponentTags = java.lang.String
  
  type CssClassMap = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type StyleEventDetail = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
