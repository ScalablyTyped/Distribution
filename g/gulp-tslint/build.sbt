organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.3-f8da89"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-226182",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180910Z-b384f8",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180910Z-cc2fbf",
  "org.scalablytyped" %%% "chalk" % "2.4.1-c5701d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-7f8b58",
  "org.scalablytyped" %%% "commander" % "2.19.0-b7449f",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-7201ce",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-ca86dd",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180910Z-fb624b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-274633",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-816787",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-c002a7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-4aae9f",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180910Z-3c99b2",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-8ca982",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-7348e2",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-732eca",
  "org.scalablytyped" %%% "tslib" % "1.9.3-866b29",
  "org.scalablytyped" %%% "tslint" % "5.11.0-220cda",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-977c2b",
  "org.scalablytyped" %%% "typescript" % "3.2.2-542c62")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        