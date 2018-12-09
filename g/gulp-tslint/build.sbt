organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.3-217d10"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-ed6428",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180910Z-c36f61",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180910Z-a68bcd",
  "org.scalablytyped" %%% "chalk" % "2.4.1-de9d5d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-f388aa",
  "org.scalablytyped" %%% "commander" % "2.19.0-a52ac3",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-eeb72f",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-7b17da",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180910Z-20fd7a",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-eb50b6",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-0e1a20",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-4db107",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180910Z-38ad2f",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-90d6c1",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-d7a900",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-5334c9",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d",
  "org.scalablytyped" %%% "tslint" % "5.11.0-1c21ed",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-2e7056",
  "org.scalablytyped" %%% "typescript" % "3.2.2-445e51")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        