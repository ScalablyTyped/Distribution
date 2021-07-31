package typings.gulpIstanbul

import typings.gulpIstanbul.mod.CoverageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CoverageVariable extends StObject {
    
    var coverageVariable: js.UndefOr[String] = js.undefined
  }
  object CoverageVariable {
    
    @scala.inline
    def apply(): CoverageVariable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoverageVariable]
    }
    
    @scala.inline
    implicit class CoverageVariableMutableBuilder[Self <: CoverageVariable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageVariableUndefined: Self = StObject.set(x, "coverageVariable", js.undefined)
    }
  }
  
  trait Dir extends StObject {
    
    var dir: js.UndefOr[String] = js.undefined
  }
  object Dir {
    
    @scala.inline
    def apply(): Dir = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dir]
    }
    
    @scala.inline
    implicit class DirMutableBuilder[Self <: Dir] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    }
  }
  
  trait Each extends StObject {
    
    var each: js.UndefOr[CoverageOptions | Double] = js.undefined
    
    var global: js.UndefOr[CoverageOptions | Double] = js.undefined
  }
  object Each {
    
    @scala.inline
    def apply(): Each = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Each]
    }
    
    @scala.inline
    implicit class EachMutableBuilder[Self <: Each] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEach(value: CoverageOptions | Double): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      @scala.inline
      def setGlobal(value: CoverageOptions | Double): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    }
  }
}
