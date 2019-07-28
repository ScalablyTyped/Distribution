package typings.markdownDashPdf

import typings.markdownDashPdf.markdownDashPdfMod.PaperFormat
import typings.markdownDashPdf.markdownDashPdfMod.PaperOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object markdownDashPdfStrings {
  @js.native
  sealed trait A3 extends PaperFormat
  
  @js.native
  sealed trait A4 extends PaperFormat
  
  @js.native
  sealed trait A5 extends PaperFormat
  
  @js.native
  sealed trait Legal extends PaperFormat
  
  @js.native
  sealed trait Letter extends PaperFormat
  
  @js.native
  sealed trait Tabloid extends PaperFormat
  
  @js.native
  sealed trait landscape extends PaperOrientation
  
  @js.native
  sealed trait portait extends PaperOrientation
  
  @scala.inline
  def A3: A3 = "A3".asInstanceOf[A3]
  @scala.inline
  def A4: A4 = "A4".asInstanceOf[A4]
  @scala.inline
  def A5: A5 = "A5".asInstanceOf[A5]
  @scala.inline
  def Legal: Legal = "Legal".asInstanceOf[Legal]
  @scala.inline
  def Letter: Letter = "Letter".asInstanceOf[Letter]
  @scala.inline
  def Tabloid: Tabloid = "Tabloid".asInstanceOf[Tabloid]
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  @scala.inline
  def portait: portait = "portait".asInstanceOf[portait]
}

