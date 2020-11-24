package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CssClasses extends js.Object
/**
  * @license
  * Copyright 2020 Google Inc.
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
@JSImport("@material/tooltip/constants", "CssClasses")
@js.native
object CssClasses extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CssClasses with String] = js.native
  
  @js.native
  sealed trait HIDE extends CssClasses
  /* "mdc-tooltip--hide" */ @js.native
  object HIDE extends TopLevel[HIDE with String]
  
  @js.native
  sealed trait HIDE_TRANSITION extends CssClasses
  /* "mdc-tooltip--hide-transition" */ @js.native
  object HIDE_TRANSITION extends TopLevel[HIDE_TRANSITION with String]
  
  @js.native
  sealed trait MULTILINE_TOOLTIP extends CssClasses
  /* "mdc-tooltip--multiline" */ @js.native
  object MULTILINE_TOOLTIP extends TopLevel[MULTILINE_TOOLTIP with String]
  
  @js.native
  sealed trait SHOWING extends CssClasses
  /* "mdc-tooltip--showing" */ @js.native
  object SHOWING extends TopLevel[SHOWING with String]
  
  @js.native
  sealed trait SHOWING_TRANSITION extends CssClasses
  /* "mdc-tooltip--showing-transition" */ @js.native
  object SHOWING_TRANSITION extends TopLevel[SHOWING_TRANSITION with String]
  
  @js.native
  sealed trait SHOWN extends CssClasses
  /* "mdc-tooltip--shown" */ @js.native
  object SHOWN extends TopLevel[SHOWN with String]
}
