package typings.jupyterlabDocumentsearch

import typings.jupyterlabCodemirror.mod.CodeMirrorEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait APPLET extends StObject {
    
    var APPLET: Boolean
    
    var AREA: Boolean
    
    var AUDIO: Boolean
    
    var BASE: Boolean
    
    var BODY: Boolean
    
    var CANVAS: Boolean
    
    var EMBED: Boolean
    
    var HEAD: Boolean
    
    var IFRAME: Boolean
    
    var IMG: Boolean
    
    var LINK: Boolean
    
    var MAP: Boolean
    
    var META: Boolean
    
    var NOEMBED: Boolean
    
    var NOSCRIPT: Boolean
    
    var OBJECT: Boolean
    
    var PARAM: Boolean
    
    var PICTURE: Boolean
    
    var SCRIPT: Boolean
    
    var SOURCE: Boolean
    
    var STYLE: Boolean
    
    var SVG: Boolean
    
    var TITLE: Boolean
    
    var TRACK: Boolean
    
    var VIDEO: Boolean
  }
  object APPLET {
    
    inline def apply(
      APPLET: Boolean,
      AREA: Boolean,
      AUDIO: Boolean,
      BASE: Boolean,
      BODY: Boolean,
      CANVAS: Boolean,
      EMBED: Boolean,
      HEAD: Boolean,
      IFRAME: Boolean,
      IMG: Boolean,
      LINK: Boolean,
      MAP: Boolean,
      META: Boolean,
      NOEMBED: Boolean,
      NOSCRIPT: Boolean,
      OBJECT: Boolean,
      PARAM: Boolean,
      PICTURE: Boolean,
      SCRIPT: Boolean,
      SOURCE: Boolean,
      STYLE: Boolean,
      SVG: Boolean,
      TITLE: Boolean,
      TRACK: Boolean,
      VIDEO: Boolean
    ): APPLET = {
      val __obj = js.Dynamic.literal(APPLET = APPLET.asInstanceOf[js.Any], AREA = AREA.asInstanceOf[js.Any], AUDIO = AUDIO.asInstanceOf[js.Any], BASE = BASE.asInstanceOf[js.Any], BODY = BODY.asInstanceOf[js.Any], CANVAS = CANVAS.asInstanceOf[js.Any], EMBED = EMBED.asInstanceOf[js.Any], HEAD = HEAD.asInstanceOf[js.Any], IFRAME = IFRAME.asInstanceOf[js.Any], IMG = IMG.asInstanceOf[js.Any], LINK = LINK.asInstanceOf[js.Any], MAP = MAP.asInstanceOf[js.Any], META = META.asInstanceOf[js.Any], NOEMBED = NOEMBED.asInstanceOf[js.Any], NOSCRIPT = NOSCRIPT.asInstanceOf[js.Any], OBJECT = OBJECT.asInstanceOf[js.Any], PARAM = PARAM.asInstanceOf[js.Any], PICTURE = PICTURE.asInstanceOf[js.Any], SCRIPT = SCRIPT.asInstanceOf[js.Any], SOURCE = SOURCE.asInstanceOf[js.Any], STYLE = STYLE.asInstanceOf[js.Any], SVG = SVG.asInstanceOf[js.Any], TITLE = TITLE.asInstanceOf[js.Any], TRACK = TRACK.asInstanceOf[js.Any], VIDEO = VIDEO.asInstanceOf[js.Any])
      __obj.asInstanceOf[APPLET]
    }
    
    extension [Self <: APPLET](x: Self) {
      
      inline def setAPPLET(value: Boolean): Self = StObject.set(x, "APPLET", value.asInstanceOf[js.Any])
      
      inline def setAREA(value: Boolean): Self = StObject.set(x, "AREA", value.asInstanceOf[js.Any])
      
      inline def setAUDIO(value: Boolean): Self = StObject.set(x, "AUDIO", value.asInstanceOf[js.Any])
      
      inline def setBASE(value: Boolean): Self = StObject.set(x, "BASE", value.asInstanceOf[js.Any])
      
      inline def setBODY(value: Boolean): Self = StObject.set(x, "BODY", value.asInstanceOf[js.Any])
      
      inline def setCANVAS(value: Boolean): Self = StObject.set(x, "CANVAS", value.asInstanceOf[js.Any])
      
      inline def setEMBED(value: Boolean): Self = StObject.set(x, "EMBED", value.asInstanceOf[js.Any])
      
      inline def setHEAD(value: Boolean): Self = StObject.set(x, "HEAD", value.asInstanceOf[js.Any])
      
      inline def setIFRAME(value: Boolean): Self = StObject.set(x, "IFRAME", value.asInstanceOf[js.Any])
      
      inline def setIMG(value: Boolean): Self = StObject.set(x, "IMG", value.asInstanceOf[js.Any])
      
      inline def setLINK(value: Boolean): Self = StObject.set(x, "LINK", value.asInstanceOf[js.Any])
      
      inline def setMAP(value: Boolean): Self = StObject.set(x, "MAP", value.asInstanceOf[js.Any])
      
      inline def setMETA(value: Boolean): Self = StObject.set(x, "META", value.asInstanceOf[js.Any])
      
      inline def setNOEMBED(value: Boolean): Self = StObject.set(x, "NOEMBED", value.asInstanceOf[js.Any])
      
      inline def setNOSCRIPT(value: Boolean): Self = StObject.set(x, "NOSCRIPT", value.asInstanceOf[js.Any])
      
      inline def setOBJECT(value: Boolean): Self = StObject.set(x, "OBJECT", value.asInstanceOf[js.Any])
      
      inline def setPARAM(value: Boolean): Self = StObject.set(x, "PARAM", value.asInstanceOf[js.Any])
      
      inline def setPICTURE(value: Boolean): Self = StObject.set(x, "PICTURE", value.asInstanceOf[js.Any])
      
      inline def setSCRIPT(value: Boolean): Self = StObject.set(x, "SCRIPT", value.asInstanceOf[js.Any])
      
      inline def setSOURCE(value: Boolean): Self = StObject.set(x, "SOURCE", value.asInstanceOf[js.Any])
      
      inline def setSTYLE(value: Boolean): Self = StObject.set(x, "STYLE", value.asInstanceOf[js.Any])
      
      inline def setSVG(value: Boolean): Self = StObject.set(x, "SVG", value.asInstanceOf[js.Any])
      
      inline def setTITLE(value: Boolean): Self = StObject.set(x, "TITLE", value.asInstanceOf[js.Any])
      
      inline def setTRACK(value: Boolean): Self = StObject.set(x, "TRACK", value.asInstanceOf[js.Any])
      
      inline def setVIDEO(value: Boolean): Self = StObject.set(x, "VIDEO", value.asInstanceOf[js.Any])
    }
  }
  
  trait Editor extends StObject {
    
    var editor: CodeMirrorEditor
  }
  object Editor {
    
    inline def apply(editor: CodeMirrorEditor): Editor = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Editor]
    }
    
    extension [Self <: Editor](x: Self) {
      
      inline def setEditor(value: CodeMirrorEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    }
  }
}
