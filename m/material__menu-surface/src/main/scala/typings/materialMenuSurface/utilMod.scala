package typings.materialMenuSurface

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  /**
    * Returns the name of the correct transform property to use on the current browser.
    */
  @JSImport("@material/menu-surface/util", "getTransformPropertyName")
  @js.native
  def getTransformPropertyName(globalObj: Window): CssTransformPropertyName = js.native
  @JSImport("@material/menu-surface/util", "getTransformPropertyName")
  @js.native
  def getTransformPropertyName(globalObj: Window, forceRefresh: Boolean): CssTransformPropertyName = js.native
  
  /**
    * @license
    * Copyright 2018 Google Inc.
    *
    * Permission is hereby granted, free of charge, to any person obtaining a copy
    * of this software and associated documentation files (the "Software"), to deal
    * in the Software without restriction, including without limitation the rights
    * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    * copies of the Software, and to permit persons to whom the Software is
    * furnished to do so, subject to the following conditions:
    *
    * The above copyright notice and this permission notice shall be included in
    * all copies or substantial portions of the Software.
    *
    * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    * THE SOFTWARE.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.materialMenuSurface.materialMenuSurfaceStrings.transform
    - typings.materialMenuSurface.materialMenuSurfaceStrings.webkitTransform
  */
  trait CssTransformPropertyName extends StObject
  object CssTransformPropertyName {
    
    @scala.inline
    def transform: typings.materialMenuSurface.materialMenuSurfaceStrings.transform = "transform".asInstanceOf[typings.materialMenuSurface.materialMenuSurfaceStrings.transform]
    
    @scala.inline
    def webkitTransform: typings.materialMenuSurface.materialMenuSurfaceStrings.webkitTransform = "webkitTransform".asInstanceOf[typings.materialMenuSurface.materialMenuSurfaceStrings.webkitTransform]
  }
}
