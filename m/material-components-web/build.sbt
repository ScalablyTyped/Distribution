organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-c95108"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-e8c94b",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-0fafe0",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-c0999e",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-c0d11b",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-a50874",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190313Z-09d646",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-54e9c7",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-56d2f4",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-5bdff4",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-d9f649",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-514099",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-cd5024",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-f84690",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-ddd93f",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-f9cbfb",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-19df07",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-e62e3d",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-2c7d05",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-77f056",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-2a8b40",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-3690ec",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-645e06",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-199a2d",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-bd0aa6",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-d247de",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-514d21",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        