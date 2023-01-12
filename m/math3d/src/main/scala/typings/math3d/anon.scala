package typings.math3d

import typings.math3d.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Angle extends StObject {
    
    var angle: Double
    
    var axis: Vector3
  }
  object Angle {
    
    inline def apply(angle: Double, axis: Vector3): Angle = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Angle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Angle] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAxis(value: Vector3): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    }
  }
  
  trait Columns extends StObject {
    
    var columns: Double
    
    var rows: Double
  }
  object Columns {
    
    inline def apply(columns: Double, rows: Double): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double, z: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
