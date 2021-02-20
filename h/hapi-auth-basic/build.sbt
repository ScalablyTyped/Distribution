organization := "org.scalablytyped"
name := "hapi-auth-basic"
version := "5.0.0-dt-20201002Z-524ac2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200923Z-a95606",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-f1405e",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20201028Z-a9a88e",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-36d70f",
  "org.scalablytyped" %%% "joi" % "17.3.0-7ba32d",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-64e776",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20201002Z-463d11",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20201002Z-d8189f",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-15bc78",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
