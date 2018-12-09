organization := "org.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20180910Z-62bd3a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180910Z-5cb6a5",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180910Z-e6ba81",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180910Z-428bff",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180910Z-d25ac5",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180910Z-23be7f",
  "org.scalablytyped" %%% "material__drawer" % "0.35-dt-20180910Z-8cf60e",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180910Z-34d725",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180910Z-2d1db9",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180910Z-6c9202",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180910Z-fd7ec5",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180910Z-299ab0",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180910Z-8ff4c0",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180910Z-2fac40",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180910Z-31ec18",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180910Z-a2dff1",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180910Z-cefd99",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180910Z-a5cd56",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180910Z-da81f9",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180910Z-34a9c4",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180910Z-62104d",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180910Z-6bfd25",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20180910Z-ba68a0",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180910Z-3aa4b9",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180910Z-ef0630",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        