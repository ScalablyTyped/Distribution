package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Button")
  @js.native
  /**
    * 按钮控件
    */
  open class Button ()
    extends StObject
       with typings.hummerEnv.Button
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("CanvasView")
  @js.native
  /**
    * 画布组件，可用于绘制一些自定义图形，如：线段、矩形、圆形、椭圆、图片、文本等，从而实现复杂图形的展示。
    */
  open class CanvasView ()
    extends StObject
       with typings.hummerEnv.CanvasView {
    def this(id: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("HorizontalScroller")
  @js.native
  /**
    * 水平滚动组件。
    */
  open class HorizontalScroller ()
    extends StObject
       with typings.hummerEnv.HorizontalScroller {
    
    /**
      * 添加子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def appendChild(view: HummerComponent): Unit = js.native
    
    /**
      * 在指定子视图前插入一个子视图
      *
      * @param view 新的子视图
      * @param existingChild 指定的子视图
      */
    /* CompleteClass */
    override def insertBefore(view: HummerComponent, existingChild: HummerComponent): Unit = js.native
    
    /**
      * 移除所有子视图
      */
    /* CompleteClass */
    override def removeAll(): Unit = js.native
    
    /**
      * 移除子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def removeChild(view: HummerComponent): Unit = js.native
    
    /**
      * 把指定的子视图替换成另一个子视图
      *
      * @param newView 新的子视图
      * @param oldView 指定的子视图
      */
    /* CompleteClass */
    override def replaceChild(newView: HummerComponent, oldView: HummerComponent): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Input")
  @js.native
  /**
    * 单行文本输入组件。
    */
  open class Input ()
    extends StObject
       with typings.hummerEnv.Input
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("List")
  @js.native
  /**
    * 列表组件。
    */
  open class List ()
    extends StObject
       with typings.hummerEnv.List
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Scroller")
  @js.native
  /**
    * 垂直滚动组件。
    */
  open class Scroller ()
    extends StObject
       with typings.hummerEnv.Scroller {
    
    /**
      * 添加子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def appendChild(view: HummerComponent): Unit = js.native
    
    /**
      * 在指定子视图前插入一个子视图
      *
      * @param view 新的子视图
      * @param existingChild 指定的子视图
      */
    /* CompleteClass */
    override def insertBefore(view: HummerComponent, existingChild: HummerComponent): Unit = js.native
    
    /**
      * 移除所有子视图
      */
    /* CompleteClass */
    override def removeAll(): Unit = js.native
    
    /**
      * 移除子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def removeChild(view: HummerComponent): Unit = js.native
    
    /**
      * 把指定的子视图替换成另一个子视图
      *
      * @param newView 新的子视图
      * @param oldView 指定的子视图
      */
    /* CompleteClass */
    override def replaceChild(newView: HummerComponent, oldView: HummerComponent): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Switch")
  @js.native
  /**
    * 开关组件。
    */
  open class Switch ()
    extends StObject
       with typings.hummerEnv.Switch
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("TextArea")
  @js.native
  /**
    * 多行文本输入组件。
    */
  open class TextArea ()
    extends StObject
       with typings.hummerEnv.TextArea
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("View")
  @js.native
  /**
    * 容器视图，类似于web端的div标签，内部可以放入其他子视图。
    */
  open class View ()
    extends StObject
       with typings.hummerEnv.View {
    def this(id: String) = this()
    
    /**
      * 添加子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def appendChild(view: HummerComponent): Unit = js.native
    
    /**
      * 在指定子视图前插入一个子视图
      *
      * @param view 新的子视图
      * @param existingChild 指定的子视图
      */
    /* CompleteClass */
    override def insertBefore(view: HummerComponent, existingChild: HummerComponent): Unit = js.native
    
    /**
      * 移除所有子视图
      */
    /* CompleteClass */
    override def removeAll(): Unit = js.native
    
    /**
      * 移除子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def removeChild(view: HummerComponent): Unit = js.native
    
    /**
      * 把指定的子视图替换成另一个子视图
      *
      * @param newView 新的子视图
      * @param oldView 指定的子视图
      */
    /* CompleteClass */
    override def replaceChild(newView: HummerComponent, oldView: HummerComponent): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ViewPager")
  @js.native
  /**
    * 可自动轮播滚动的翻页组件。
    */
  open class ViewPager ()
    extends StObject
       with typings.hummerEnv.ViewPager
}
